package src.javaruch.lesson7;
/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * <p>
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 * <p>
 * 3. Выведи результат на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Echo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
for (String s : result) System.out.println(s);;
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String string : list) {
            resultList.add(string);
            resultList.add(string);
        }

        return resultList;
    }
}
