package javaruch.Syntax.level10.lecture11;

/**
 * Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
 * помещает их в HashMap и выводит на экран содержимое HashMap.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Numbers10 {

    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Numbers10() {
        this.map = new HashMap<Integer, String>();

        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Numbers10 solution = new Numbers10();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            if (name != null) {
                String name = reader.readLine();
                    solution.map.put(index, name);

            }
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }

}
