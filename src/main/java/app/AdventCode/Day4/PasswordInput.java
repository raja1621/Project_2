package app.AdventCode.Day4;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class PasswordInput {
    static HashMap<String, String> password;
    static HashMap<Integer, HashMap> mainpass = new HashMap<>();;
    static boolean isparamsEnd;
    static int count = 0;

    PasswordInput(){
        password = new HashMap<>();
    }

    public void passparams(String input) {
       if (input.length() == 0 || input == null) {
           mainpass.put(count++, password);
//           password.clear();
           new PasswordInput();
       } else  {
//           System.out.println(input);
           String key = input.split(":")[0].trim();
           String value = input.split(":")[1].trim();
           if (!password.containsKey(key)){
               password.put(key, value);
           }
       }
       mainpass.put(count, password);
    }

//    public static void main(String[] args) throws URISyntaxException, IOException {
//        InputSchemaBuilderForDay4 inputSchemaBuilderForDay4 = new InputSchemaBuilderForDay4();
//        inputSchemaBuilderForDay4.inputSchema("Day4.txt");
//        System.out.println(PasswordInput.mainpass);
//    }
}
