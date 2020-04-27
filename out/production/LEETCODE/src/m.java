import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class m {


    public static void main(String[] args) {
//        LeetCode0081 solution = new LeetCode0081();
//        int[] nums = {1, 1, 1, 1, 1, 1, 3, 1, 1};
////        System.out.println(solution.findRotateIndex(nums, 0, nums.length - 1));
//        System.out.println(solution.search(nums, 3));

        RoughFuzzySet roughFuzzySet = new RoughFuzzySet();
        float[][] decisionTable = new float[][] {
                {0.5f, 0.8f, 2f,  1f},
                {1f, 1f,  0.5f, 0f},
                {1.3f, 1.3f, 3f,  0f},
                {1f, 1.4f, 1f,  1f},
                {1f, 1.4f, 2f,  0f},
                {1.4f, 1.3f, 1f,  1f},
                {1f, 1.6f, 3f,  1f},
                {1f, 4f,   3f,  1f}
        };
        int m = decisionTable.length;
        decisionTable = roughFuzzySet.fuzzySet(decisionTable);


//        float[][] matrix1 = roughFuzzySet.select(1, decisionTable); // 选择条件属性
//        float[][] matrix2 = roughFuzzySet.select(2, decisionTable); // 选择条件属性
//        float[][] matrix3 = roughFuzzySet.select(3, decisionTable); // 选择条件属性
//        float[][] decision = roughFuzzySet.uniteMatrix(matrix1, matrix3); //
//
//        String[][] decisionMatrix  = new String[m][m];
//        decisionMatrix= roughFuzzySet.setDecisionMatrix(decision, decisionMatrix, "a");
//        decision = roughFuzzySet.uniteMatrix(matrix2, matrix3); // 选择条件属性
//        decisionMatrix = roughFuzzySet.setDecisionMatrix(decision, decisionMatrix, "b");
//        List breakPoint = roughFuzzySet.breakPoint(decisionMatrix, "b", matrix2);
//        decisionTable = roughFuzzySet.discretization(decisionTable, 2, breakPoint);
//
//        matrix1 = roughFuzzySet.select(1, decisionTable); // 选择条件属性
//        matrix2 = roughFuzzySet.select(2, decisionTable); // 选择条件属性
//        matrix3 = roughFuzzySet.select(3, decisionTable); // 选择条件属性
//        decision = roughFuzzySet.uniteMatrix(matrix1, matrix3); // 选择条件属性
//
//        decisionMatrix  = new String[m][m];
//        decisionMatrix= roughFuzzySet.setDecisionMatrix(decision, decisionMatrix, "a");
//        decision = roughFuzzySet.uniteMatrix(matrix2, matrix3); // 选择条件属性
//        decisionMatrix = roughFuzzySet.setDecisionMatrix(decision, decisionMatrix, "b");
//        breakPoint = roughFuzzySet.breakPoint(decisionMatrix, "a", matrix1);
//        System.out.println(breakPoint);
//        decisionTable = roughFuzzySet.discretization(decisionTable, 1, breakPoint);
        for (int i = 0; i < m; i++) {
            for (float num: decisionTable[i]) {
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
//
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(decisionMatrix[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }



//        List indA = roughFuzzySet.setIND(condition); // 条件属性的不可分辨关系
//        List decision = roughFuzzySet.setIND(roughFuzzySet.select(3, decisionTable));
//        System.out.println(roughFuzzySet.importance(decision, indA)); // 属性的重要性程度

//        System.out.println("a" + "b");
    }
}
