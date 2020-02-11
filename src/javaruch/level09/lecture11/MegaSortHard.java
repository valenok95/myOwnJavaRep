package javaruch.level09.lecture11;
/**
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MegaSortHard {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        Set stringSet = new TreeSet();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        List<String> firstList = Arrays.asList(array);
        for (String element : firstList) // разносим массив в сет и лист
        {
            if (isNumber(element)) {
                numbers.add(Integer.parseInt(element)); // если число - в лист чисел
            } else {
                stringSet.add(element); // если слово - в сет стрингов
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers); // разворачиваем по убыванию

        ArrayList<String> resultList = new ArrayList<>();
        for (Object e : stringSet) {
            resultList.add(e.toString());
        }
        for (Integer e : numbers)
        {
            resultList.add(e.toString());
        }
        for(int i=0;i<array.length;i++)
        {
            array[i]=resultList.get(i);
        }
        isGreaterThan("A","b"); // не пригодился, благодаря ThreeSet'у!

    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
