import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Задача №17: Запись данных в файлЗадание
        Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
        Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
        Пользователь при тестировании программы по правилу черного ящика должен понимать,
        какой принцип остановки записи в файл он должен подать.
*/

public class Task17 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\resources\\test.txt"));
        //PrintWriter toTxtFile = new PrintWriter("src\\resources\\test.txt");
        String text;
        System.out.println("Чтобы закончить ввод, наберите слово stop");
        //String stop = "stop";
        do {
            text = scan.nextLine();
            if (text.equals("stop")) {
                    break;
                }
                else {
                    writer.write(text + "\n");
                }

        } while (!text.equals("stop"));
        writer.close();
    }
}

