package src.javaruch.lesson8.last;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Вывести пять наибольших чисел.
 * Каждое значение с новой строки.
 */
import static java.util.Arrays.sort;

public class Finalists {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        int tmp;
        for (int i = 1; i < array.length; i++) {//сортировка вставками
            for (int j = i; j > 0 && array[j] > array[j-1]; j--) {
                tmp = array[j-1];
                array[j-1] = array[j];
                array[j] = tmp;
            }
        }
    }
}
