package javaruch.level09.lecture11;
/**
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 *
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 22
 * 0
 * Арбуз
 *
 * Пример вывода:
 * Арбуз
 * 22
 * Боб
 * 3
 * Вишня
 * 1
 * 0
 * Яблоко
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        String tmp;
        int count=0;
        for(int i=0;i<array.length;i++)
            for (int j=i;j>0;j--)
            {
                if (isNumber(array[j-1]))
                {
                    tmp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                }
            }
        for(int i=0;i<array.length;i++) {
            String tmp2 ;
            while (!isNumber(array[i+1])) {
                if (isGreaterThan(array[i], array[i + 1])) {
                    tmp2 = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp2;
                }
                i++;
            }
                count = i;
                break;
        }
        for(int i=array.length-1;i>count+1;i--)
           for (int j = i; j > 0 && Integer.parseInt(array[j])<=Integer.parseInt(array[j-1]); j--)
            {
                tmp = array[j];
                array[i]=array[j-1];
                array[j-1]=tmp;
            }
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
