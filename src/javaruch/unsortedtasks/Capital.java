package javaruch.unsortedtasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Capital {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = "";
        int number;// Integer.parseInt(reader.readLine());
        int sum = 0;
        while (true) {
            tmp = reader.readLine();
            if (!tmp.equals("сумма")) {
                number = Integer.parseInt(tmp);
                sum += number;
            }else break;
        }
        System.out.println(sum);
    }
    }
