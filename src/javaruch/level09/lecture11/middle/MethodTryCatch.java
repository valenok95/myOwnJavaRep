package javaruch.level09.lecture11.middle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Написать программу, которая будет вводить числа с клавиатуры.
 * Код по чтению чисел с клавиатуры должен быть в методе readData.
 * Код внутри readData обернуть в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 */
public class MethodTryCatch {
    public static void main(String[] args)  {
        readData();
    }

    public static void readData()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String stringNumber;

        int number;
        try {
            while (true) {
                stringNumber = reader.readLine();
                number = Integer.parseInt(stringNumber);
                list.add(number);
            }
        } catch (RuntimeException | IOException e) {
            for (int element : list) {
                System.out.println(element);
            }

        }
    }

}
