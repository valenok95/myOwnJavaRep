import java.util.Scanner;

/*
Задача №4: Отработка поразрядных операций
Задание:   Ввести с консоли число в бинарном формате.
        Перевести его в десятичный формат, записать в переменную int и вывести на экран.
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String b = read.nextLine();
        int decimal = Integer.parseInt(b, 2);
        System.out.println(decimal);
    }
}
