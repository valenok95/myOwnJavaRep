import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Задача №14: Преобразование типовЗадание
        Необходимо написать программу, которая будет реализовывать следующие действия:
        1. Ввод числа с клавиатуры и запись его в строковую переменную S
        2. Конвертация строковой переменной S в числовую переменную X типа int
        3. Конвертация числа X типа int в число Y типа double
        Все три числа разных типов необходимо в столбик вывести на экран
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String S = read.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.printf("S = " + S + '\n' + "X = " + X + '\n' + "Y = " + Y);

    }
}
