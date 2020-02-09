package javaruch.level08.last;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static класс кот - Cat.
 * 2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
 * 3. В методе main удалите одного кота из Set cats.
 * 4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 * Каждый кот с новой строки.
 *
 */
public class CatsSet {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cats;
        //напишите тут ваш код. step 2 - пункт 2
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat:cats){
            System.out.println(cat);
        }
        // step 4 - пункт 4
    }
    public static class Cat{

    }
}
