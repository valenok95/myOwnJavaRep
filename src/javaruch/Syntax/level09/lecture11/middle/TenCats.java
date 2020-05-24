package javaruch.Syntax.level09.lecture11.middle;

import java.util.*;

/**
 * Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 */
public class TenCats {
    public static void main(String[] args) {
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
        Set<Cat> catSet = new HashSet<Cat>();
        Iterator<Map.Entry<String,Cat>> iterator = catMap.entrySet().iterator();
        /*while (iterator.hasNext())
        {
            catSet.add(iterator.next().getValue());
        }*/
        for(Map.Entry keyAndCat : catMap.entrySet())
        {
            catSet.add((Cat) keyAndCat.getValue());
        }
        for(Cat cat:catSet)
        {
            System.out.println(cat);
        }

    }

    static Map<String, TenCats.Cat> catMap = new HashMap<>();


    public static class Cat{
        String name;
        public Cat(String name){
            this.name=name;
        }
        public Cat(){
        }
    }
}
