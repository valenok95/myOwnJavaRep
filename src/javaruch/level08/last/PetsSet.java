package javaruch.level08.last;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
 * 2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
 * 3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
 * 4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
 * 5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
 * 6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
 * Каждое животное с новой строки.
 */
public class PetsSet {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Cat cat0 = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        result.add(cat0);
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<Dog>();
        Dog dog0 =new Dog();
        Dog dog1 =new Dog();
        Dog dog2 =new Dog();
        dogs.add(dog0);
        dogs.add(dog1);
        dogs.add(dog2);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);

        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Cat> iteratorCat = cats.iterator();
        Iterator<Object> iteratorPet = pets.iterator();
        while(iteratorPet.hasNext()){
            Object pet = iteratorPet.next();
            if (cats.contains(pet)){
                iteratorPet.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for(Object pet:pets){
            System.out.println(pet);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
    //напишите тут ваш код
}

