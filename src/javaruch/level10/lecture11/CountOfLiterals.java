package javaruch.level10.lecture11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита).
 * Результат вывести на экран в алфавитном порядке.
 */
public class CountOfLiterals {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        Map<Character, Integer> resultMap = new TreeMap<>();
        for (Character element : alphabet) {
            resultMap.put(element, 0);
        }
        for (String string : list) {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (alphabet.contains(c)) {
                    int count = resultMap.get(c);
                    resultMap.put(c, ++count);
                }
            }

        }

        for (Map.Entry pair : resultMap.entrySet()) {
            if (pair.getKey().toString().equals("ё"))
            {
                break;
            } else
            System.out.println(pair.getKey() + " " + pair.getValue());
            if(pair.getKey().toString().equals("е")){
                char c="ё".charAt(0);
                int yoCount = resultMap.get(c);
                System.out.println("ё " + yoCount);
            }

        }
    }
}
