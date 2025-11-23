import java.util.*;

public class BFS {

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

    static void bfs(String start, String target){
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()){
            String node = queue.poll();
            System.out.println(node + " ");

            if(node.equals(target)) break;

            for (String child : graph.get(node)){
                if(!visited.contains(child)){
                    visited.add(child);
                    queue.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs("a1", "a7");
    }
}
