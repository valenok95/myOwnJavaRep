package javaruch.level09.lecture11.middle;

import java.util.ArrayList;

/**
 * Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
 * Заполнить массивы любыми данными и вывести их на экран.
 */
public class ListCreatingJavaRushVer {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList () {
        int [] arrays = {5, 2, 4, 7, 0 }; // из за этого дерьма javarush не пропускал тест
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int element : arrays) {
            int[] array = new int[element];
            for (int i = 0; i < element; i++) {
                array[i] = i;
            }
            list.add(array);
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
