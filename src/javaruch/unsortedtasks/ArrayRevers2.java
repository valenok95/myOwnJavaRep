package javaruch.unsortedtasks;
/*1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayRevers2 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(read.readLine());
        }
        int tmp;
        for (int i=0;i<arr.length/2;i++){
            tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
