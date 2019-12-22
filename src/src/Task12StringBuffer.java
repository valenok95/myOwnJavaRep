package src;
/*
Задача №12: Удаление всех пробелов в заданном текстеЗадание
        Для введенной с клавиатуры строки необходимо провести отсев пробелов.
        Результат в виде строки без пробелов вывести на экран.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12StringBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String string = read.readLine();
        StringBuffer result = new StringBuffer();
        char s;
        for (int i=0;i<string.length();i++) {
            s = string.charAt(i);
            if (s!=' ') {
                result.append(s);
            }}
        System.out.println(result.toString());
    }
}