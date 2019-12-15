package src.javaruch.lesson8.lection06;

import java.util.*;

public class RemovingDuplicates {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Сергей");
        map.put("Смирнов", "Максим");
        map.put("Сидоров", "Максим");
        map.put("Уваров", "Тимофей");
        map.put("Альмухаметов", "Андрей");
        map.put("Коваленко", "Максим");
        map.put("Степнов", "Илья");
        map.put("Лермонтов", "Илья");
        map.put("Пушкин", "Александр");
        map.put("Петров", "Тимофей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> values = new ArrayList<>(map.values());
        Set<String> set = new HashSet<>(map.values());
        for (String s:set){
            values.remove(s);
        }
        for (String s:values){
            removeItemFromMapByValue(map,s);
        }

        }



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
