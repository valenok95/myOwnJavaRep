package javaruch.Syntax.level10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
 * помещает их в HashMap и выводит на экран содержимое HashMap.
 */
public class HashMapTask {

    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public HashMapTask() {
        this.map = new HashMap<Integer, String>();

        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        HashMapTask hashMapTask = new HashMapTask();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            if (name == null) {
                String name = reader.readLine();
                hashMapTask.map.put(index, name);

            }
        }

        for (Map.Entry<Integer, String> pair : hashMapTask.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
