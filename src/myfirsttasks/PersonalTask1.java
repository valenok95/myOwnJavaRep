package myfirsttasks;

import java.util.Scanner;

/*
Итоговая задача 1
Ввести с консоли число в бинарном формате. Перевести его в десятичный формат , записать в переменную int и вывести на экран.
Необходимо использовать циклы, нельзя использовать готовые методы языка Java для перевода числа из одной системы счисления в другую.
*/
public class PersonalTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 0, temp, i;

        for (i = 0; number >= 1; i++) {
            temp = (number % 10) * 2;
            number /= 10;
            result += (pow(temp, i));
        }

        System.out.println(result);

    }


    private static int pow(int number, int exp) {
        int result = 1;
        if (exp == 0 & number != 0) {
            return 1;
        }
         else if (number == 0) {
            return 0;}
        else {
            for (int i = 0; i < exp; i++) {
                result *= number;
            }
            return result;
        }

    }
}
