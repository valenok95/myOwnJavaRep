package javaruch.level07;

import java.util.ArrayList;

/**
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 */
public class RandL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String string : strings) {
            int r = 0;
            int l = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i)=='р') r++;
                else if (string.charAt(i)=='л') l++;

               /* char s = string.charAt(i);
                r += s == 'р' ? 1 : 0;
                l += s == 'л' ? 1 : 0;*/
            }
            if (l != 0) {
                resultList.add(0,string);
                if (r == 0) resultList.add(0,string);
            } else if ( r == 0) resultList.add(0,string);
        }
        return resultList;
    }
}
