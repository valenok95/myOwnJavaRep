package myfirsttasks;

import java.util.Arrays;
import java.util.Scanner;

/*
Задание №9: Ввод/вывод данных для массива
        Произведите ввод данных с клавиатуры в массив,
        а после этого произведите вывод массива на экран,
        где каждый элемент массива умножается на 2.
        Размер массива задается пользователем.
*/
public class Task9 {
    public static void main(String[] args) {
        System.out.println("Задайте размер массива");
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        int i, j;
        int[] arr = new int[a];
        System.out.println("Заполните массив");
        for (i = 0; i < a; i++) {
            j = r.nextInt();
            arr[i] = j * 2;
        }
        String strArr = Arrays.toString(arr);
        System.out.println(strArr); // вывод одной строкой

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // вывод циклом (на всякий случай)
        }
    }
}
