package javaruch.level09.lecture11.middle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
 * Заполнить массивы любыми данными и вывести их на экран.
 */
public class ListCreating {
    public static void main(String[] args) {
        for (int[] array : createList (5, 2, 4, 7, 0)) {
            for (int element : array) {
                System.out.print(element +" ");
            }
            System.out.println();
        }
    }
    // из за этого дерьма javarush не пропускал тест
    public static ArrayList<int[]> createList (int... a) {
        ArrayList list = new ArrayList<int[]>();
        for (int element : a) {
            int[] array = new int[element];
            for (int i = 0; i < element; i++) {
                array[i] = i;
            }
            list.add(array);
        }
        return list;
    }
}
