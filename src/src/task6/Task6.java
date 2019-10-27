package task6;
/*
Задача №6: Отработка арифметических операцийЗадание
        Написать программу, которая будет выполнять следующие действия:
        1. Ввод трех чисел с клавиатуры x, y, z
        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
        3. Деление среднего арифметического на 2 без остатка
        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int z = read.nextInt();
        int sr = sredneeIs3(x, y, z);
        int half = sr / 2;
        System.out.println(sredneeIs3(x, y, z));
        if (half > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

    public static int sredneeIs3(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
