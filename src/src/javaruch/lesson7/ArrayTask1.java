package src.javaruch.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк.
        2. Добавь в него 5 различных строк.
        3. Выведи его размер на экран.
        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class ArrayTask1 {
    static ArrayList<String> list;
    public static void main(String[] args) throws IOException {

toFillList(createList(),5);
getList(list);
    }
    public static ArrayList<String> createList(){
        ArrayList<String> list = new ArrayList<>();
        ArrayTask1.list=list;
        return ArrayTask1.list;
    }
    public static void toFillList(ArrayList<String> list, int count) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<count;i++){
            list.add("algo");
        }
    }
    public static void getList(ArrayList<String> listo4ek){
        for (int i=0;i<listo4ek.size();i++){
            System.out.println(listo4ek.get(i));
        }
    }
}
