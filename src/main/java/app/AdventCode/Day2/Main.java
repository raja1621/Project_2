package app.AdventCode.Day2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    private final static InputParseForDay2 inputParseForDay2 = new InputParseForDay2();
    private final static  InputSchemaBuilder inputSchemaBuilder = new InputSchemaBuilder();

    static void getInputArray(List<String> list){
        list.stream().forEach( it -> {
            String min = it.substring(0, it.indexOf('-'));
            String max = it.substring(it.indexOf('-') + 1, it.indexOf(':')-1);
            String key = it.substring(it.indexOf(':')-1, it.indexOf(':'));
            String password = it.substring(it.indexOf(':')+1);
            checkForPassword(min, max, key, password);
        });
    }

    private static void checkForPassword(String min, String max, String key, String password) {
        int[] charArry = new int[256];
        for (int i = 0; i< password.length(); i++) {
            charArry[password.charAt(i)]++;
        }
        if (charArry[(int)key.toCharArray()[0]] >= Integer.parseInt(min)
                && charArry[(int)key.toCharArray()[0]] <= Integer.parseInt(max)){
            System.out.println("min :"+min +" "+ "max :" +max +" "+"key :" +key +" " +password +":::" +"Valid Password");
        }else {
            System.out.println("min :"+min +" "+ "max :" +max +" "+"key :" +key +" " +password +":::"+"Invalid Password");
        }

    }

    public static void main(String[] args) throws URISyntaxException, IOException {
      inputParseForDay2.getInput("Day2.txt");
//      inputSchemaBuilder.printInput();
        getInputArray(inputSchemaBuilder.getInputList());

    }
}
