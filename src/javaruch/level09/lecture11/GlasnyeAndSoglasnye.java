package javaruch.level09.lecture11;
/**
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы из введённой строки.
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * Пример ввода:
 * Мама мыла раму.
 *
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GlasnyeAndSoglasnye {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        separator(text);

    }
    public static void separator(String text)
    {
        StringBuffer vowelString = new StringBuffer();
        StringBuffer unvowelString = new StringBuffer();
        char c;
        for (int i=0;i<text.length();i++)
        {
            c=text.charAt(i);

            if (c!=' '){
                if (isVowel(c))
                {
                    vowelString.append(Character.toString(c)+' ');
                }
                else
                    unvowelString.append(Character.toString(c)+' ');
            }
        }

        System.out.println(vowelString.toString()+"\n"+unvowelString.toString());
    }
    public static boolean isVowel(char c){

        boolean is=false;
        for(int i=0;i<vowels.length;i++)
        {
            if (Character.toLowerCase(c)==vowels[i])
                return true;
        }
        return false;
    }
    //преложенная реализация интода к задачке:
   /* public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }*/
}
