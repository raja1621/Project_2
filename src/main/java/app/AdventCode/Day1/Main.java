package app.AdventCode.Day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        InputParse inputParse = new InputParse();
        List<Integer> arr =  inputParse.getInput("Day1.txt");

        new Main().findStarsSum(arr, 2020);
    }

    private void findStarsSum(List<Integer> arr, int k) {
        HashSet<Integer> map = new HashSet();
        for (int i = 0; i < arr.size(); i++){
            int temp = k - arr.get(i);
            if (map.contains(temp)){
                System.out.println(
                        "Pair with given sum "
                                + k + " is (" + arr.get(i)
                                + ", " + temp + ")");
            }else {
                map.add(arr.get(i));
            }
        }
    }
}
