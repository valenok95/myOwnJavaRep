package src.javaruch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;/*
1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
        индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

        Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
public class ArraySolution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String[] arrString= new String[10];
        int[] arrInt = new int[10];
        for (int i=0;i<arrString.length;i++){
            arrString[i]=read.readLine();
        }
        for (int i=0;i<arrInt.length;i++){
            arrInt[i]=arrString[i].length();
        }
        for (int i=0;i<arrInt.length;i++){
            System.out.println(arrInt[i]);
        }
    }
}
