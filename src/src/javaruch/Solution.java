package src.javaruch;

/*
Задача: У каждой кошки есть имя, кот-папа и кошка-мама.
        Изменить класс Cat так, чтобы он мог описать данную ситуацию.
        Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
        Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

        Пример ввода:
        дедушка Вася
        бабушка Мурка
        папа Котофей
        мама Василиса
        сын Мурчик
        дочь Пушинка

        Пример вывода:
        The cat's name is дедушка Вася, no mother, no father
        The cat's name is бабушка Мурка, no mother, no father
        The cat's name is папа Котофей, no mother, father is дедушка Вася
        The cat's name is мама Василиса, mother is бабушка Мурка, no father
        The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandDad = reader.readLine();
        Cat catGrandDad = new Cat(grandDad);

        String grandMom = reader.readLine();
        Cat catGrandMom = new Cat(grandMom);

        String dad = reader.readLine();
        Cat catFather = new Cat(catGrandDad,dad);

        String mom = reader.readLine();
        Cat catMother = new Cat(mom,catGrandMom);

        String catSonName = reader.readLine();
        Cat catSon = new Cat(catSonName,catMother,catFather);

        String catDaughterName = reader.readLine();
        Cat catDaughter = new Cat(catDaughterName,catMother,catFather);

        System.out.println(catGrandDad);
        System.out.println(catGrandMom);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }
        Cat(Cat father,String name) {
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String s = "The cat's name is "+name;

            if (mother == null)
                s += ", no mother ";
            else
                s+=", mother is " + mother.name;
            if  (father == null)
                s += ", no father ";
            else
                s+=", father is " + father.name;
            return s;
        }
    }

}