package app.AdventCode.Day2;

import app.AdventCode.FileCreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class InputParseForDay2 {

   static InputSchemaBuilder inputSchemaBuilder = new InputSchemaBuilder();

    void getInput(String filename) throws URISyntaxException, IOException {
        BufferedReader bufferedReader = new FileCreation().getFile(filename);
        bufferedReader.lines().sequential().map( it ->
                  it.replaceAll("\\s", "")
        ).forEach(
                inputSchemaBuilder :: getInput
        );
    }

//    public static void main(String[] args) throws URISyntaxException, IOException {
//        InputParseForDay2 inputParseForDay2 = new InputParseForDay2();
//        inputParseForDay2.getInput("Day2.txt");
//        System.out.println(inputSchemaBuilder.getMinvalue());
//        System.out.println(inputSchemaBuilder.getMaxvalue());
//
//    }
}
