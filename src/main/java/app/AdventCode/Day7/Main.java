package app.AdventCode.Day7;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    static WeightedGraph graph = new WeightedGraph();
    static GraphBuilder graphBuilder = new GraphBuilder();
    static AtomicBoolean isBagFound = new AtomicBoolean(false);
    private static Set<String> part1 =  new HashSet<>();

    public Set<String> findAllBagsContainingBag(String bagColor, int totalEdges) {
        Set<String> vertices = graph.getEdges().keySet();
        vertices.stream().forEach(vertex -> {
//            System.out.println("vertex " + vertex);
                    isBagFound.set(false);
                    dfs(vertex, graph, bagColor);
                }
        );
        return part1;
    }

    private void dfs(String vertex, WeightedGraph graph, String bagColor) {
        if (vertex.contains(bagColor)){
            isBagFound.set(true);
            return;
        }
        if (graph.getEdges().containsKey(vertex)){
//            System.out.println(vertex);
            Iterator<WeightedEdge> itr = graph.getEdges().get(vertex).listIterator();
            while (itr.hasNext()){
                WeightedEdge edge = itr.next();
                if (!isBagFound.get()){
                    dfs(edge.getDes(), graph, bagColor);
                    if (isBagFound.get())
                        part1.add(vertex);
                }
            }
        }
//        else {
//            System.out.println(vertex + "Not Exists");
//        }
    }


    public static void main(String[] args) throws URISyntaxException, IOException {
        graphBuilder.buildGraphFromFile("Day7.txt");
//        graph.print();
      Set noofBags = new Main().findAllBagsContainingBag("shiny gold", graph.totalEdges());
      System.out.println(noofBags);
    }
}
