package javaruch.Syntax.level08.last;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 **/
public class MinOfN {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (min > array.get(i)) {
                min=array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        // Создать и заполнить список тут
        return list;
    }
}
