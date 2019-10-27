import java.util.Scanner;

/*
Задача №5: Таблица умножения
        Задание
Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
        Использовать циклы запрещено.
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        System.out.println(a + "x1 = " + (a * 1));
        System.out.println(a + "x2 = " + (a * 2));
        System.out.println(a + "x3 = " + (a * 3));
        System.out.println(a + "x4 = " + (a * 4));
        System.out.println(a + "x5 = " + (a * 5));
        System.out.println(a + "x6 = " + (a * 6));
        System.out.println(a + "x7 = " + (a * 7));
        System.out.println(a + "x8 = " + (a * 8));
        System.out.println(a + "x9 = " + (a * 9));
        System.out.println(a + "x10 = " + (a * 10));
    }
}
