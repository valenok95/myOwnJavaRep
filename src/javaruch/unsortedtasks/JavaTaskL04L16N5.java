package javaruch.unsortedtasks;

import java.util.Scanner;

public class JavaTaskL04L16N5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine();
        int d = scan.nextInt();
        int m = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Меня зовут "+name+"\nЯ родился "+d+"."+m+"."+y);
    }
}
