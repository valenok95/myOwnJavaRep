package src.javaruch.lesson7;

import java.util.ArrayList;
import java.util.Collections;

public class MotherWashing {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"мама","мыла","раму");
        for (int i=3;i>0;i--){
            list.add(i,"именно");
        }
        printList(list);
    }
    public static void printList(ArrayList<String> list) {
        for (String x : list) System.out.println(x);
    }
}
