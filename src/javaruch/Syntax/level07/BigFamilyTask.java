package javaruch.Syntax.level07;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 */
public class BigFamilyTask {
    public static void main(String[] args) {
            Human c1 = new Human("Val", true, 24);
            Human c2 = new Human("Julia", false, 22);
            Human c3 = new Human("Alex", true, 20);

            ArrayList<Human> dmc = new ArrayList<>(Arrays.asList(c1, c2, c3));

            Human d = new Human("Oleg", true, 51, dmc);
            Human m = new Human("Olga", false, 47, dmc);

            ArrayList<Human> gp1c = new ArrayList<>(Arrays.asList(d));
            ArrayList<Human> gp2c = new ArrayList<>(Arrays.asList(m));

            Human gd1 = new Human("Nikolay", true, 77, gp1c);
            Human gdm1 = new Human("Maya", false, 73, gp1c);
            Human gd2 = new Human("Yuriy", true, 82, gp2c);
            Human gdm2 = new Human("Shura", false, 82, gp2c);
            System.out.println(gd1.toString());
            System.out.println(gd2.toString());
            System.out.println(gdm1.toString());
            System.out.println(gdm1.toString());
            System.out.println(m.toString());
            System.out.println(d.toString());
            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
        }


    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children =new ArrayList<Human>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
