package app.AdventCode.Day4;

import app.AdventCode.FileCreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class InputSchemaBuilderForDay4 {

    void inputSchema(String filename) throws URISyntaxException, IOException {
        BufferedReader bufferedReader = new FileCreation().getFile(filename);
        PasswordInput passwordInput = new PasswordInput();
      bufferedReader.lines().sequential().forEach(line ->
               getKeyValuesForInput(line)
               .forEach(passwordInput::passparams)
       );
    }

    private List<String> getKeyValuesForInput(String line){
       return Arrays.stream(line.split(" ")).collect(Collectors.toList());
    }



//    public static void main(String[] args) throws URISyntaxException, IOException {
//        InputSchemaBuilderForDay4 inputSchemaBuilderForDay4 = new InputSchemaBuilderForDay4();
//        inputSchemaBuilderForDay4.inputSchema("Day4.txt");
//    }
}
