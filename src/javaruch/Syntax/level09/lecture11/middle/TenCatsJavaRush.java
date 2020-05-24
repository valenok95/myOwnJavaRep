package javaruch.Syntax.level09.lecture11.middle;

import java.util.*;

/**
 * Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 */
public class TenCatsJavaRush {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Name1",new Cat());
        catMap.put("Name2",new Cat());
        catMap.put("Name3",new Cat());
        catMap.put("Name4",new Cat());
        catMap.put("Name5",new Cat());
        catMap.put("Name6",new Cat());
        catMap.put("Name7",new Cat());
        catMap.put("Name8",new Cat("Vasya"));
        catMap.put("Name9",new Cat());
        catMap.put("Name10",new Cat());
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<Cat>();

        Iterator<Map.Entry<String,Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            catSet.add(iterator.next().getValue());
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }
        public Cat() {
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
