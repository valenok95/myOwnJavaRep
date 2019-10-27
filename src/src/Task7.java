/*
Задача №7: Условие вывода данныхЗадание
        Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
        В программе должны присутствовать константы X, Y, Z.
        Программа должна сравнивать введенное значение с клавиатуры со значением констант
        и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
        Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
*/
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int X = 10;
        final int Y = 15;
        final int Z = 20;
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        if (number!=X & number!=Y & number!=Z){
            System.out.println("Такой константы нет!");}
            else {
            System.out.println("Данное значение имеется в константах");}
    }
    }

