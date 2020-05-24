package javaruch.Syntax.level09.lecture11.middle;

import java.io.*;
// с нормальным циклом
/**
 * Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Если файла (который нужно копировать) с указанным именем не существует,
 * то программа должна вывести надпись "Файл не существует."
 * и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
 */
public class FileWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//C:\Users\Valentin\IdeaProjects\myOwnJavaRep\src\resources\test.txt
        String sourceFileName;
        InputStream fileInputStream=null;
        boolean correctPath=false;
        do {
            try {
                sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                correctPath = true;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
            }
        } while (!correctPath);


        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
