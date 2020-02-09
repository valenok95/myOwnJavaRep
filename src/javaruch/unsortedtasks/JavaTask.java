package javaruch.unsortedtasks;

import java.util.Scanner;
// Вывести среднее из трёх чисел
public class JavaTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int o = scan.nextInt();
        if ((m<=n && m>=o)||(m>=n && m<=o)){
            System.out.println(m);
        }
        else if ((n<=m && n>=o)||(n>=m && n<=o)){
            System.out.println(n);
        }
        else if ((o>=m && n>=o)||(o<=m && o>=n)){
            System.out.println(o);
        }
    }
}