package javaruch.Syntax.level08.last;

import java.util.HashMap;
import java.util.Map;

public class SameNames {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Иванов", "Сергей");
        map.put("Смирнов", "Максим");
        map.put("Сидоров", "Максим");
        map.put("Уваров", "Тимофей");
        map.put("Альмухаметов", "Андрей");
        map.put("Коваленко", "Максим");
        map.put("Смирнов", "Илья");
        map.put("Лермонтов", "Илья");
        map.put("Пушкин", "Александр");
        map.put("Петров", "Тимофей");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
