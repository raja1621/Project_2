package app.AdventCode.Day2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class InputSchemaBuilder {
    private static List<String> inputList;

    InputSchemaBuilder(){
        inputList = new ArrayList<>();
    }

    public List<String> getInputList() {
        return inputList;
    }

    public void getInput(String str){
        inputList.add(str);
    }

    public void printInput(){
        System.out.println(inputList);
    }

//    public static void main(String[] args) throws URISyntaxException, IOException {
//        InputParseForDay2 inputParseForDay2 = new InputParseForDay2();
//        inputParseForDay2.getInput("Day2.txt");
//        System.out.println(inputSchemaBuilder.inputList);
//    }

}
