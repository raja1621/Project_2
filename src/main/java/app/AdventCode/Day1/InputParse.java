package app.AdventCode.Day1;

import app.AdventCode.FileCreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class InputParse {

    static List<Integer> list = new ArrayList();

    List<Integer> getInput(String filename) throws URISyntaxException, IOException {
        BufferedReader bufferedReader = new FileCreation().getFile(filename);
        bufferedReader.lines().sequential().map(
                Integer::parseInt
        ).forEach(
                it -> list.add(it)
        );
        return list;
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        new InputParse().getInput("Day1.txt");
        System.out.println(list);
    }

}
