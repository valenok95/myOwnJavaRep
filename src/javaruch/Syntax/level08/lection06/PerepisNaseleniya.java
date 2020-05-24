package javaruch.Syntax.level08.lection06;

import java.util.*;

public class PerepisNaseleniya {
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        List<String> list = new ArrayList<>(map.values());
        for (String s:list) {
            if (name.equals(s)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Set <String> set = new HashSet<>(map.keySet());
        int count = 0;
        for (String s:set) {
            if (lastName.equals(s)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
getCountTheSameFirstName(createMap(),"Сергей");
    }

}
