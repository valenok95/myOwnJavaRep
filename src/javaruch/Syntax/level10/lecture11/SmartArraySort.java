package javaruch.Syntax.level10.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SmartArraySort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int [] arrayReversed = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            arrayReversed[array.length-1-i]=array[i];
        }
        //напишите тут ваш код
    }
}
