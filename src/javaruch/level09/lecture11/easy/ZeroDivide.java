package javaruch.level09.lecture11.easy;

import java.util.Random;

/**
 * Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
 * Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
 */

public class ZeroDivide {

    public static void main(String[] args) {

        try
        {
            divideByZero();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
    public static void divideByZero()
    {
        System.out.println(5/0);
    }
}
