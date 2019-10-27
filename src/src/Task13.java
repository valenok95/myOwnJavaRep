import java.util.Scanner;

/*
Задача №13: Сравнение двух строкЗадание
        Необходимо провести сравнение длины двух строк,
        которые были введены с клавиатуры и записаны в соответствующие переменные.
        Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
*/
public class Task13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String replica1 = read.nextLine();
        System.out.println("Введите вторую строку");
        String replica2 = read.nextLine();
        if (replica1.length() > replica2.length()) {
            System.out.println(replica1);
        } else if (replica2.length() > replica1.length()) {
            System.out.println(replica2);
        } else {
            System.out.printf("Длина введенных строк одинаковая.");
        }


    }
}
