package src.javaruch;
/*1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTaskHard {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(read.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == longestString(list) || list.get(i) == shortestString(list)) {
                System.out.println(list.get(i));
                break;
            }
        }
       /* System.out.println("самая короткая строка"+ shortestString(list));
        System.out.println("самая длинная строка"+ longestString(list));*/
    }

    public static String longestString(ArrayList<String> list) {
        int longer = list.get(0).length();
        String longerString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            longer = list.get(i).length() > longer ? list.get(i).length() : longer;
        }

       // System.out.println("Длина длинной короткой строки:"+longer);
        for (int i = 0; i < list.size(); i++) {
            if (longer == list.get(i).length()) {
                longerString = list.get(i);
                break;
            }
        }
        return longerString;
    }

    public static String shortestString(ArrayList<String> list) {
        int shorter = list.get(0).length();
        String shorterString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            shorter = list.get(i).length() < shorter ? list.get(i).length() : shorter; //получаем длину самой короткой строки
        }
       // System.out.println("Длина самой короткой строки:"+shorter);
        for (int j = 0; j < list.size(); j++) {
            if (shorter == list.get(j).length()) {
                shorterString = list.get(j);
                break;//ищем строку с этой длиной и возвращаем её
            }//пропустив эту скобку я потерял полчаса на поиски причины того, что у меня скипается последний цикл for
        }
        return shorterString;
    }
}
