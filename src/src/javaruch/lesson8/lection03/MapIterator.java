package src.javaruch.lesson8.lection03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("земляника", "ягода");
        map.put("вишня", "ягода");
        map.put("ирис", "цветок");
        map.put("банан", "трава");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("картофель", "клубень");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key+" "+value);
        }
    }
}
