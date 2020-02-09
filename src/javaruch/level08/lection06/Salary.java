package javaruch.level08.lection06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Salary {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Смирнов", 500);
        map.put("Сидоров", 300);
        map.put("Уваров", 500);
        map.put("Альмухаметов", 500);
        map.put("Коваленко", 500);
        map.put("Степнов", 550);
        map.put("Лермонтов", 200);
        map.put("Пушкин", 500);
        map.put("Петров", 600);
        return map;

    }
    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> i=map.entrySet().iterator();
        while (i.hasNext()){
            if (i.next().getValue()<500){
                i.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
