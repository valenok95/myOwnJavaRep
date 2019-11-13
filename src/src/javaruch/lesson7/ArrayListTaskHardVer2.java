package src.javaruch.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTaskHardVer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        System.out.println(getFirstPick(list));
    }

    // getFirstPick вернуть первое из пиковых значений.
    public static String getFirstPick(ArrayList<String> list) {
        int indexMax = list.size();
        int indexMin = list.size();
        int maxLength = list.get(list.size() - 1).length();
        int minLength = list.get(list.size() - 1).length();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (maxLength < list.get(i).length()) {
                maxLength = list.get(i).length();
                indexMax = i;
            } else if (minLength > list.get(i).length()) {
                minLength = list.get(i).length();
                indexMin = i;
            }
        }
        return (indexMax > indexMin ? list.get(indexMin) : list.get(indexMax));
    }
}