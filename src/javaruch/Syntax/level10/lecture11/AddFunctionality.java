package javaruch.Syntax.level10.lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 * Пустая строка - конец ввода данных.
 * Числа могут повторяться.
 * Строки всегда уникальны.
 * Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран.
 * Каждую пару с новой строки.
 * <p>
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 * 1
 * Мыла
 */
public class AddFunctionality {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> mapa = new HashMap<>();

        while (true) {
            int id=0;
            try {
                id = Integer.parseInt(reader.readLine());
            }
            catch (Exception e)
            {
                break;
            }
            String name = reader.readLine();
            if (name.trim().length()==0) {
                mapa.put("",id);
                break;
            }
            mapa.put(name,id);
        }
        for (Map.Entry<String, Integer> pair : mapa.entrySet()) {
            int id = pair.getValue();
            String name = pair.getKey();
            System.out.println(id + " " + name);
        }
    }
}
