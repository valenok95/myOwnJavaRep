package src.javaruch.lesson8.lection03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxSequence2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(reader.readLine()));
        int count = 0;
        int countTmp = 0;
        for (int i = 1; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
            if (numbers.get(i).equals(numbers.get(i - 1))) countTmp++;
            else {
                if (countTmp > count) count = countTmp;
                countTmp = 0;
            }
        }
        if (countTmp > count) count = countTmp;

        System.out.println(count + 1);

    }
}

