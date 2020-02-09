package myfirsttasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

/*
Задача №18: Выгрузка данных из файла, проверка и перезапись
Задание        Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
        а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
        Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
*/
public class Task18 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> testList = Files.readAllLines(Paths.get("src\\resources\\test.txt"), UTF_8);
        int countOfStrings = 0;
        for (String string : testList) {
            System.out.println(string);
            countOfStrings++;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\resources\\test.txt"));

        String text;
        for (int i = countOfStrings; i > 0; i--) {
            text = scan.nextLine();
            writer.write(text + "\n");
        }
        writer.close();
    }
}