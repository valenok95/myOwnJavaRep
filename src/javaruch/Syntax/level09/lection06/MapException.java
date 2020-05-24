package javaruch.Syntax.level09.lection06;

import java.util.HashMap;

public class MapException {

    public static void main(String[] args) {


    try {
        HashMap<String, String> map = new HashMap<String, String>(null);
        System.out.println("after create");
        map.put(null, null);
        System.out.println("after put");
        map.remove(null);
        System.out.println("after remove");
    }
        catch(NullPointerException e)
        {
            System.out.println(e.getClass());
        }
    }
}
