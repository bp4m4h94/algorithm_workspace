package main;

import java.util.*;

public class Breadth_first_search {

    private static Map<String, List<String>> graph = new HashMap<>();

    // search the closest supplier of in my friends group;
    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
        search("you");
    }

    private static boolean search(String name) {

        Deque<String> search_queue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();

        while (!search_queue.isEmpty()) {
            String checkedPerson = search_queue.poll();
            if (!searched.contains(checkedPerson)) {
                if (isSeller(checkedPerson)) {
                    System.out.println(checkedPerson);
                    return true;
                } else {
                    searched.add(checkedPerson);
                    search_queue.addAll(graph.get(checkedPerson));
                }
            }
        }
        return false;
    }

    private static boolean isSeller(String name) {
        return name.endsWith("m");
    }
}
