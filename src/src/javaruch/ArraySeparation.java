package src.javaruch;
/*1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySeparation {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(read.readLine());
        }
        int [] arr1 = new int [10];
        int [] arr2 = new int [10];
        for (int i=0;i<array.length;i++){
           if (i<array.length/2){
               arr1[i]=array[i];
           }
           else arr2[i-array.length/2]=array[i];
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
