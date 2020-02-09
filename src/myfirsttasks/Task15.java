package myfirsttasks;

import java.util.Scanner;

/*
Задача №15: Сортировка данных в массивеЗадание
        Написать программу сортировки по возрастанию заданного пользователем массива чисел.
        Использовать пузырьковый метод сортировки.
*/
public class Task15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int value;
        System.out.println("Укажите размерность массива");
        int max = read.nextInt();
        ArrayClass arr = new ArrayClass(max); //создали экземпляр от ArrayClass
        for (int j = 0; j < max; j++) {
            System.out.println("Введите " + (j + 1) + "-ый элемент массива");
            value = read.nextInt();
            arr.inserting(value); //зациклил метод заполнения массива
        }
        arr.sort(); // задействовал метод сортировки массива
        arr.print(); //вывод
    }


    static class ArrayClass {
        private int[] arr; // ссылка на массив
        private int counter; // количество элементов массива

        public ArrayClass(int maxLength) { // конструктор класса ArrayClass
            arr = new int[maxLength]; // создание массива размером maxlength
            counter = 0; // при создании массив имеет 0 элементов
        }

        public void print() {
            for (int i = 0; i < counter; i++) {
                System.out.print(arr[i] + " ");   // вывод массива
            }
        }

        Scanner read = new Scanner(System.in);

        public void inserting(int value) {
            arr[counter] = value;
            counter++;
        }


        public void sort() {
            for (int out = counter - 1; out >= 1; out--) { //внешний цикл
                for (int in = 0; in < out; in++) { //внутренний цикл
                    if (arr[in] > arr[in + 1])  // если значение у элемента больше, чем у следующего
                        swap(in, in + 1); // свапаем элементы(см. swap)
                }
            }
        }

        public void swap(int first, int next) { //на вход метода 2 индекса
            int c = arr[first]; //переменной "с" присваиваю значение элемента массива с 1-ым индексом
            arr[first] = arr[next]; // элемент массива с 1-ым индексом получает значение элемента с индексом next
            arr[next] = c; // элемент с индексом next получает первоначальное значение элемента с 1-ым индексом
        }
    }
}