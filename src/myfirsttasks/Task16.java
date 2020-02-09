package myfirsttasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/*
Задача №16: Выгрузка данных из файла на экран
Задание       Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
*/
public class Task16 {
    public static void main(String[] args) throws IOException {
        List<String> testList = Files.readAllLines(Paths.get("src\\resources\\test.txt"),UTF_8);
for (String l : testList){
    System.out.println(l);
}

    }

}
