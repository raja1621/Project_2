package app.AdventCode.Day7;

import app.AdventCode.FileCreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Bag {

    private String name;
    private Map<String, Integer> contains = new HashMap<>();

    Bag(String rule) {
        String[] sArr = rule.split("contain");
        name = sArr[0];
        rule = sArr[1];

        Pattern p = Pattern.compile("(\\d+) (\\w+ \\w+)");

        for (String s : rule.split(",")){
//            System.out.println(s);
//           System.out.println(s.replace("bags*\\.*","").trim());

            s = s.replace("bags*\\.*","").trim();
            Matcher m = p.matcher(s);
//            System.out.println(m);
            if (m.find()){
                int num = Integer.parseInt(m.group(1));
                String name = m.group(2);
                contains.put(name, num);
            }
        }
//        System.out.println(contains);
    }
    public boolean containsBag(String name) {
        return contains.containsKey(name);
    }

    public String getName() {
        return name;
    }

    private Bag findBag(List<Bag> allBags, String name) {
        for (Bag b : allBags) {
            if (b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public long containsNumberOfBags(List<Bag> allBags) {
        long numOfBags = 1;
        for(Map.Entry<String, Integer> bag : contains.entrySet()) {
            Bag foundBag = findBag(allBags, bag.getKey());
            numOfBags += bag.getValue() * foundBag.containsNumberOfBags(allBags);
        }
        return numOfBags;
    }
}
