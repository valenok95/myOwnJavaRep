import java.util.Scanner;

/*
Задание №10: Ввод/вывод данных для матрицы
        Произведите ввод данных с клавиатуры в матрицу,
        а после этого произведите вывод первой строки матрицы на экран,
        где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("задайте размерность матрицы по вертикали");
        int a = r.nextInt();
        System.out.println("задайте размерность матрицы по горизонтали");
        int b = r.nextInt();
        int[][] arr = new int[a][b];
        int i, j;
        System.out.println("заполните матрицу");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.println("Введите " + (j + 1) + "-ый элемент " + (i + 1) + "-ой строки :");
                arr[i][j] = r.nextInt();
            }
        }
        for (j = 0; j < b; j++) {
            System.out.print((arr[0][j]) * 3 + " ");
        }
        System.out.println();
    }

}

