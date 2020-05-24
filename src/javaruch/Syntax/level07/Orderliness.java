package javaruch.Syntax.level07;
/**
 * 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 * 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Orderliness {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        toFillInList(list);
        whoBreacksTheSequence(list);
    }

    public static void whoBreacksTheSequence(ArrayList<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i+1);
                break;
            }
        }
    }

    public static void toFillInList(ArrayList<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
    }
}
