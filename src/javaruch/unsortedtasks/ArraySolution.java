package javaruch.unsortedtasks;
/*1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySolution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(read.readLine());
        }
        return array;
    }

    public static int tmp;
    public static int max(int[] array) {
        tmp=array[0];
        for(int i=0;i<array.length-1;i++){
            tmp=array[i+1]>tmp ? array[i+1] : tmp;
        }
        return tmp;
    }
}
