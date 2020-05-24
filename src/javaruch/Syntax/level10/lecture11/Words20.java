package javaruch.Syntax.level10.lecture11;
/**
 * Ввести с клавиатуры в список 20 слов.
 * Нужно подсчитать сколько раз каждое слово встречается в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число, сколько раз данное слово встречалось в списке.
 * <p>
 * Вывести содержимое словаря на экран.
 * В тестах регистр (большая/маленькая буква) влияет на результат.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Words20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String word : list) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else
                result.put(word, 1);

        }
        return result;
    }

}
