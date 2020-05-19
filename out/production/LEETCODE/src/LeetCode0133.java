import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0133 {
//    public Node cloneGraph(Node node) {
//        Map<Node, Node> lookup = new HashMap<>();
//        return dfs(node, lookup);
//    }
//
//    private Node dfs(Node node, Map<Node, Node> lookup) {
//        if (node == null) return null;
//        if (lookup.containsKey(node)) return lookup.get(node);
//        Node clone = new Node(node.val, new ArrayList<>());
//        lookup.put(node, clone);
//        for (Node n: node.neighbors) clone.neighbors.add(dfs(n, lookup));
//        return clone;
//    }

    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        return dfs(node);

    }

    private Node dfs(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node, clone);
        for (Node neighbor: node.neighbors) {
            clone.neighbors.add(dfs(neighbor));
        }
        return clone;
    }
}
