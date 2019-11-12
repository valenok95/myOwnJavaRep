package src.javaruch;
/*
1. Создать массив на 15 целых чисел.
        2. Ввести в него значения с клавиатуры.
        3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
        Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
        4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIsOddGraterThanEven {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(read.readLine());
        }
        int sumOdd=0;
        int sumEven=0;
        for (int i=0;i<array.length;i++){
            if(i%2==0){
                sumEven+=array[i];
            } else sumOdd+=array[i];

        }

        String odd  ="В домах с нечетными номерами проживает больше жителей.";
        String even = "В домах с четными номерами проживает больше жителей.";
        System.out.print(sumEven>sumOdd ? even : odd);
    }
}
