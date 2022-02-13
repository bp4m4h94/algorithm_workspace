package main;

import java.util.*;

public class Breadth_first_search_2 {

    private static Map<String, List<String>> graph = new HashMap<>();
    public static String START = "cab";
    public static final String DESTINATION = "bat";

    // arrive destination in the quickest way
    public static void main(String[] args) {
        graph.put("cab", Arrays.asList("cat", "car"));
        graph.put("cat", Arrays.asList("mat", "bat"));
        graph.put("car", Arrays.asList("cat", "bar"));
        graph.put("mat", Arrays.asList("bat"));
        graph.put("bar", Arrays.asList("bat"));
        graph.put(DESTINATION, Collections.emptyList());
        arrive("cab");
    }

    private static boolean arrive(String name) {

        Deque<String> search_queue = new ArrayDeque<>(graph.get(name));
        List<String> searchedList = new ArrayList<>();
        String route = "";
        route += START;

        while (!search_queue.isEmpty()) {
            String vertex = search_queue.poll();
//            if (!searched.contains(vertex)) {
                if (isDestination(vertex)) {
                    for (String searched : searchedList) {
                        if (graph.get(searched).contains(vertex)) {
                            route += "->";
                            route += searched;
                        }
                    }
                    route += "->";
                    route += vertex;
                    route += "->";
                    route += DESTINATION;
                    System.out.println(route);
                    return true;
                } else {
                    searchedList.add(vertex);
                    search_queue.addAll(graph.get(vertex));
                }
//            }
        }
        return false;

    }

    private static boolean isDestination(String name) {
        return graph.get(name).contains(DESTINATION);
    }
}
