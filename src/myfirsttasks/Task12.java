package myfirsttasks;/*
Задача №12: Удаление всех пробелов в заданном текстеЗадание
        Для введенной с клавиатуры строки необходимо провести отсев пробелов.
        Результат в виде строки без пробелов вывести на экран.
*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String string = r.nextLine();
        String formattedString = string.replaceAll(" ", "");
        System.out.println(formattedString);
    }
}

