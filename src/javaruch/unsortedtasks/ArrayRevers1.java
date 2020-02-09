package javaruch.unsortedtasks;
/*1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayRevers1 {
        public static void main(String[] args) throws Exception {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String[] arr= new String[10];
            for (int i=0;i<8;i++){
                arr[i]=read.readLine();
            }
            String tmp;
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
