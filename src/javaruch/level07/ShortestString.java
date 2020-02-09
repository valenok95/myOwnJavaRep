package javaruch.level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortestString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == getMinString(list)) {
                System.out.println(list.get(i));
            }


        }
    }

        public static int getMinString (ArrayList < String > list) {
            //int indexMin = list.size();
            int minLength = list.get(list.size() - 1).length();
            for (int i = list.size() - 1; i >= 0; i--) {
                if (minLength > list.get(i).length()) {
                    minLength = list.get(i).length();
                    //  indexMin = i;
                }
            }
            return minLength;
        }
    }
