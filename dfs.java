import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS {

    static Map<String, List<String>> graph = Map.of(
            "a1", List.of("a2", "a3"),
            "a2", List.of("a4", "a5"),
            "a3", List.of("a6"),
            "a4", List.of("a7"),
            "a5", List.of("a8"),
            "a6", List.of(),
            "a7", List.of(),
            "a8", List.of()
    );

    static Set<String> visited = new HashSet<>();

    static void dfs(String node, String target) {

        visited.add(node);
        System.out.println(node + " ");

        if(node.equals(target)) return;

        for (String child : graph.get(node)){
            if(!visited.contains(child)){
                dfs(child, target);
            }
        }
    }

    public static void main(String[] args) {
        dfs("a1", "a7");
    }
}
