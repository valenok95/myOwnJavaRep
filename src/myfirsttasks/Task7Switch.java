package myfirsttasks;

import java.util.Scanner;

public class Task7Switch {

    public static void main(String[] args) {
        final int X = 10;
        final int Y = 15;
        final int Z = 20;
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();
        switch (number) {
            case X: {
            }
            case Y: {
            }
            case Z: {
                System.out.println("Данное значение имеется в константах");
                break;
            }
            default: {
                System.out.println("Такой константы нет!");
            }


        }

    }
}
