import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
Напишите программу конвертер валют.
        Программа должна переводить рубли в доллары по текущему курсу.
        Пользователь вводит текущий курс и количество рублей.
        Итоговое значение должно быть округлено до двух знаков после запятой.
        (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80
*/
public class PersonalTask3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите текущий курс (руб/$) : ");
        double course = read.nextDouble();
        System.out.println("Введите количество рублей : ");
        double count = read.nextDouble();
        double temp = count/course;
        double result = new BigDecimal(Double.toString(temp)).setScale(2,RoundingMode.UP).doubleValue();//не маленькая конструкция для округления получилась...
//результат не округляется для чисел - выше девятизначных
        System.out.println("Итого : "+result+"$");
    }
}
