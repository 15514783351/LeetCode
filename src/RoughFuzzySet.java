import java.util.*;

public class RoughFuzzySet {
    /*U a b d
    x1 0.8 2 1
    x2
    ...
    x8*/
    float[][] decisionTable;
    int m;

    /*
    有问题，会出现相同重要度情况，无法区分情况
     */

    public float[][] fuzzySet(float[][] decisionTable) {
        int m = decisionTable.length;
        int n = decisionTable[0].length;

        String[] conditionNameStr = {"a", "b", "c", "d", "e"}; // 条件属性
        Map<Integer, String> conditionNameMap = new HashMap<>(); // <条件属性1, 2, 3   对应的属性名称 a b c>
        Map<Integer, Integer> conditionImportanceMap = new HashMap<>();  //<对应的重要性, 条件属性>
        for (int i = 0; i < n; i++) conditionNameMap.put(i + 1, conditionNameStr[i]);
        System.out.println(conditionNameMap);

        List decisionIND = setIND(select(n, decisionTable)); // 决策属性的不可分辨关系
        List<Float> importanceList = new ArrayList<>();
        List<Float> importanceListTemp = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            List conditionIND = setIND(select(i + 1, decisionTable));  //条件属性的不可分辨关系
            importanceList.add(importance(decisionIND, conditionIND));
           // importanceListTemp.add(importance(decisionIND, conditionIND)); //该种情况会出现 相同重要性
        }
        //对于相同重要性，解决方法为相同的其中一个-0.001；
        for (int i = 0; i < importanceList.size() - 1; i++) {
            float a = importanceList.get(i);
            for (int j = i + 1; j < importanceList.size(); j++) {
                if (a == importanceList.get(j)) {
                    importanceList.set(i, (float) (importanceList.get(i) + 0.01));
                }
            }
        }

        importanceListTemp.addAll(importanceList);

        System.out.println(importanceList);
        Collections.sort(importanceList); // 重要性排序 从小到大
        System.out.println(importanceList);
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (importanceListTemp.get(i).equals(importanceList.get(j))) {
                    conditionImportanceMap.put(n - 1 - j, i + 1);
                }
            }
        }
        System.out.println(conditionImportanceMap);

        float[][] conditionArray;
        float[][] decisionArray = select(n, decisionTable);
        int conditionColumn;
        String conditionName;
//        float[][] decision
        List breakPoint;
        for (int i = n - 1; i > 0; i--) {  //重要性从小到大 （即准要越高 重要性越低）
            String[][] decisionMatrix = new String[m][m];
            for (int j = 1; j < n; j++) {
                conditionName = conditionNameMap.get(j);
                conditionArray = select(j, decisionTable);
                decisionMatrix = setDecisionMatrix(uniteMatrix(conditionArray, decisionArray), decisionMatrix, conditionName);
            }
            for (int k = 0; k < m; k++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(decisionMatrix[k][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            conditionColumn = conditionImportanceMap.get(i);
            conditionName = conditionNameMap.get(conditionColumn);
            breakPoint = breakPoint(decisionMatrix, conditionName, select(conditionColumn, decisionTable));
            System.out.println(breakPoint);
            decisionTable = discretization(decisionTable, conditionColumn, breakPoint);
//            for (int k = 0; k < m; k++) {
//                for (float num: decisionTable[k]) {
//                    System.out.print(num);
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }

        }
        return decisionTable;

    }


    public float[][] select(int column, float[][] decisionTable) {
//        this.decisionTable = decisionTable;
        int m = decisionTable.length;
        float[][] res = new float[m][1];

        for (int i = 0; i < m; i++) {
            res[i][0] = decisionTable[i][column - 1];
        }

        return res;
    }

    public float[][] uniteMatrix(float[][] matrix1, float[][] matrix2) {
        int m = matrix1.length;
        float[][] res = new float[m][2];

        for (int i = 0; i < m; i++) res[i][0] = matrix1[i][0];
        for (int i = 0; i < m; i++) res[i][1] = matrix2[i][0];

        return res;
    }

    public List setIND(float[][] table) {
        int m = table.length;
        int n = table[0].length;

        List<List<Integer>> res = new ArrayList<>();
//        int count = 0;

        for (int i = 0; i < m; i++) {
            if (!inList(res, i + 1)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i + 1);
                second: for (int j = i + 1; j < m; j++) {
                    for (int k = 0; k < n; k++) {
                        if (table[i][k] != table[j][k]) {
//                            j++;
                            continue second;
                        }
                    }
                    temp.add(j + 1);
                }
                res.add(temp);
            }
        }
        return res;
    }

    public boolean inList(List res, int x) {
        int m = res.size();
        if (m == 0) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            List sample = (List) res.get(i);
            int n = sample.size();
            for (int j = 0; j < n; j++) {
                if ((int)sample.get(j) == x) return true;
            }
        }
        return false;
    }


    public float importance(List decision, List condition) {
        int m1 = decision.size();
        int m2 = condition.size();
        int length = 0;
        int count = 0;
        for (int i = 0; i < m1; i++) {
            List d = (List) decision.get(i);
            length += d.size();
            for (int j  = 0; j < m2; j++) {
                List c = (List) condition.get(j);
                if (d.containsAll(c)) {
                    int n2 = c.size();
                    count += n2;
                }
            }
        }
        return (float) count / (float) length;
    }

    public String[][] setDecisionMatrix(float[][] decisionTable, String[][] decisionMatrix, String condition) {
        int m = decisionTable.length;
        int n = decisionTable[0].length;
        String[][] res = decisionMatrix;
        for (int i = 0; i < m; i++) res[i][i] = "alpha";

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (decisionTable[i][n - 1] == decisionTable[j][n - 1]) {
                    res[i][j] = "alpha";
                } else {
                    if (decisionTable[i][0] != decisionTable[j][0]) {
                        if (res[i][j] == null) {
                            res[i][j] = "";
                        }
                        res[i][j] =  res[i][j] + condition;
                    }

                }
            }
        }

        return res;
    }

    public List breakPoint(String[][] decisionMatrix, String condition, float[][] para) {
        List<List<Integer>> breakPoint = new ArrayList<>();
        int m = decisionMatrix.length;
//        int n = decisionMatrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (decisionMatrix[i][j].equals(condition)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    breakPoint.add(temp);
                }
            }
        }
        int index = 0;
        for (List item: breakPoint) {
            float a = para[(int)item.get(0)][0];
            float b = para[(int)item.get(1)][0];
            if (a < b) {
                item.set(0, a);
                item.set(1, b);
            } else {
                item.set(0, b);
                item.set(1, a);
            }
            breakPoint.set(index, item);
            index++;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(breakPoint.get(0));
        for (int i = 0; i < breakPoint.size(); i++) {
            List b = breakPoint.get(i);
            for (int j = 0; j < res.size(); j++) {
                List r = res.get(j);
                if ((float)b.get(0) >= (float)r.get(0) && (float)b.get(1) <= (float)r.get(1)) {
                    res.set(j, b);
                } else if ((float)b.get(0) < (float)r.get(0) && (float)b.get(1) > (float)r.get(0) && (float)b.get(1) < (int)r.get(1)) {
                    b.set(0, r.get(0));
                    res.set(j, b);
                } else if ((float)r.get(0) < (float)b.get(0) && (float)b.get(0) < (float)r.get(1) && (float)r.get(1) < (float)b.get(1)) {
                    b.set(1, r.get(1));
                    res.set(j, b);
                } else if ((float)b.get(0) >= (float)((List)res.get(res.size() - 1)).get(1)) {
                    res.add(b);
                }
            }
        }


        return res;
    }


    public float[][] discretization(float[][] decisionTable, int column, List breakPoint) {
        int numsOfBreakPoint = breakPoint.size();
        int m = decisionTable.length;
        List l = (List) breakPoint.get(numsOfBreakPoint - 1);
        first: for (int i = 0; i < m; i++) {
            for (int j = 0; j < numsOfBreakPoint; j++) {
                List b = (List)breakPoint.get(j);
                if (decisionTable[i][column - 1] <= (float)b.get(0)) {
                    decisionTable[i][column - 1] = 2 * j;
                    break;
                } else if (decisionTable[i][column - 1] > (float)b.get(0) && decisionTable[i][column - 1] < (float)b.get(1)) {
                    decisionTable[i][column - 1] = 2 * j + 1;
                    break;
                } else if (decisionTable[i][column - 1] >= (float)l.get(1)) {
                    decisionTable[i][column - 1] = 2 * numsOfBreakPoint;
                    break;
                }
            }
        }

        for (int i = 0; i <= 2 * numsOfBreakPoint; i++) {
            boolean isOK = false;
            for (int j = 0; j < m; j++) {
                if ((int) decisionTable[j][column - 1] == i) {
                    isOK = true;
                    break;
                }
            }
            if (!isOK && i == 2 * numsOfBreakPoint) break;
            if (!isOK) {  //说明 列种不包含 某个值 那么需要把这个值大的-1
                for (int j = 0; j < m; j++) {
                    if (decisionTable[j][column - 1] > i) {
                        decisionTable[j][column - 1]--;
                    }
                }
                i--;
            }
        }

        return decisionTable;
    }
}
