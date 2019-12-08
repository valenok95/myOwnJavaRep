package src.javaruch.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class LongestString {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        int maxLength=0;
        strings= new ArrayList<String>();
        ArrayList<Integer> indexes= new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length()>maxLength){
                maxLength=strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if(maxLength==strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }


    }
}
