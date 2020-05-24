package javaruch.Syntax.level09.lection06;

import java.util.ArrayList;

public class ListException {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }

    }

}