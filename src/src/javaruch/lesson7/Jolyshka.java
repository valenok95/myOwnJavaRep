package src.javaruch.lesson7;
/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Jolyshka {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        add20(list);
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list0 = new ArrayList<>();
        fillLists(list, list3, list2, list0);
        printList(list3);
        printList(list2);
        printList(list0);
    }

    public static void add20(ArrayList<Integer> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void fillLists(ArrayList<Integer> list, ArrayList<Integer> list3, ArrayList<Integer> list2, ArrayList<Integer> list0) {

        for (Integer x : list) {
            if (x % 3 == 0) list3.add(x);
            if (x % 2 == 0) list2.add(x);
            if (x % 3 != 0 && x % 2 != 0) list0.add(x);
        }
    }

    public static void fillList2(ArrayList<Integer> list, ArrayList<Integer> list2) {
        for (Integer x : list) {
            if (x % 2 == 0) list2.add(x);
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) System.out.println(x);
    }

}
