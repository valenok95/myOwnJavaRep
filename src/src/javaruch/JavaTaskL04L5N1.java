package src.javaruch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaTaskL04L5N1 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String string = read.readLine();
        StringBuffer result = new StringBuffer();
        int tmp = 0;
        char s;
        for (int i = 0; i < string.length(); i++) {
            s = string.charAt(i);
            tmp = s;
            if (tmp % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
