package app.AdventCode.Day7;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightedGraph {
    static int totalEdges = 0;
    private static Map<String, List<WeightedEdge>> edges;

    public WeightedGraph() {
        edges = new HashMap<>();
    }

    public void addEdge(WeightedEdge edge){
//        System.out.println(edge.getSrc());
        if (edges.containsKey(edge.getSrc())) {
            edges.get(edge.getSrc()).add(edge);
        } else {
           List<WeightedEdge> bag =  new ArrayList<>();
           bag.add(edge);
           edges.put(edge.getSrc(),bag);
        }
        totalEdges += 1;
    }

    public int totalEdges(){
        return totalEdges;
    }

    public Map<String, List<WeightedEdge>> getEdges(){
        return Collections.unmodifiableMap(edges);
    }

    public void print() {
        this.getEdges().forEach((key, val) ->
                {
                    val.stream().map(it -> it.getDes()).forEach(
                            it -> System.out.println(key + "->" + it));
                }
                );

//        this.edges.forEach((key, val) ->
//                System.out.println(key + " -> " + val.stream()
//                        .map(WeightedEdge::getDes)
//
//                ));
//                        .collect(Collectors.joining(" "))));
    }

//    public static void main(String[] args) throws URISyntaxException, IOException {
//        WeightedGraph weightedGraph = new WeightedGraph();
//        GraphBuilder graphBuilder = new GraphBuilder();
//        graphBuilder.buildGraphFromFile("Day7.txt");
////        weightedGraph.print();
//        weightedGraph.getEdges();
//
//    }
}
