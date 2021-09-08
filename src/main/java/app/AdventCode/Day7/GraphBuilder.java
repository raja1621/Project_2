package app.AdventCode.Day7;

import app.AdventCode.FileCreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

class GraphBuilder {

    void buildGraphFromFile(String filename) throws URISyntaxException, IOException {
       WeightedGraph wg = new WeightedGraph();
       BufferedReader bufferedReader = new FileCreation().getFile(filename);
       bufferedReader.lines().sequential()
        .forEach( line ->
                buildEdge(parseV1(line), line.split("contain")[1].split(","))
        .forEach(wg :: addEdge));
    }

    private List<WeightedEdge> buildEdge(String fromEdge, String[] edgeParts) {
        List<WeightedEdge> list =Arrays.stream(edgeParts).map( it ->
                   new WeightedEdge(fromEdge, it.replaceAll("\\d","").substring(0, it.indexOf("bag")-1).trim())
       ).collect(Collectors.toList());
        return list;

    }

    private String parseV1(String line) {
        return line.split("contain")[0].substring(0, line.split("contain")[0].indexOf("bag")).trim();
    }

//    public static void main(String[] args) throws URISyntaxException, IOException {
//       GraphBuilder builder =  new GraphBuilder();
//       builder.buildGraphFromFile("Day7.txt");
//    }
}
