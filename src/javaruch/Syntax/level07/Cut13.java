package javaruch.Syntax.level07;
/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Cut13 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        add5(list);
        cut13(list);
        printer(list);
    }
    public static void add5 (ArrayList<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<5;i++){
            list.add(reader.readLine());
        }
    }
    public static void cut13(ArrayList<String> list){
        for(int i=0;i<13;i++){
            list.add(0,list.get(list.size()-1));
            list.remove(list.size()-1);
        }
    }
    public static void printer(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
