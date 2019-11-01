import java.util.Scanner;

/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
        Пользователь программы должен задавать размер массива и наполнять его числами.
        Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
*/
public class PersonalTask2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int count = read.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) { //заполнение массива.
            System.out.println("Введите " + (i + 1) + "-ый элемент массива");
            arr[i] = read.nextInt();
        }
        int tmp;
        for (int i = 1; i < count; i++) {//сортировка вставками
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                tmp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = tmp;
            }
        }

        for (int i = 0; i < count; i++) { // вывод массива
            System.out.print(arr[i] + " ");
        }
    }
}