/*
Задача №6: Отработка арифметических операцийЗадание
        Написать программу, которая будет выполнять следующие действия:
        1. Ввод трех чисел с клавиатуры x, y, z
        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
        3. Деление среднего арифметического на 2 без остатка
        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x = read.nextInt();
        double y = read.nextInt();
        double z = read.nextInt();
        System.out.println((x + y + z) / 3);
        if ( (int)((((x + y + z) / 3) / 2)) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
