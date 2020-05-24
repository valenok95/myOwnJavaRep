package javaruch.Syntax.level08.lection03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создай список чисел.
 * 2. Добавь в список 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 * <p>
 * Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
 * 3
 * <p>
 * Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 */

public class MaxSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        int countTmp = 0;
        for (int i = 0; i < 10; i++) {
            for (int x : numbers) {
                if (numbers.get(i) == x) countTmp++;
            }
            if (count < countTmp) count = countTmp;
            countTmp = 0;
        }
        System.out.println(count);    }
}
