package app.AdventCode.Day4;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class Day4Main {
    static InputSchemaBuilderForDay4 inputSchemaBuilderForDay4 = new InputSchemaBuilderForDay4();
    static PasswordInput passwordInput = new PasswordInput();
    static boolean iscontains = false;
    List<String> info = Arrays.asList("ecl","pid", "eyr", "hcl", "byr", "iyr", "hgt");
    int matchCount = 0;

    private void isPasswordValid(HashMap<Integer, HashMap> password){
        password.values().forEach(it -> {
                    System.out.println(it);
            it.keySet().forEach(key ->
                    {
                        if (key != "cid" && info.contains(key)){
                            matchCount++;
                        }
                    }
            );
            if (matchCount == info.size()){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
            matchCount = 0;
        }
        );
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        inputSchemaBuilderForDay4.inputSchema("Day4.txt");
       Day4Main day4Main =  new Day4Main();
       day4Main.isPasswordValid(passwordInput.mainpass);


    }
}
