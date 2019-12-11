package src.javaruch.lesson7;

/**
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 */
public class BigFamilyTask {
    public static void main(String[] args) {
        Human gd1 = new Human("Nikolay",true,77);
        Human gdm1 = new Human("Maya",false,73);
        Human gd2 = new Human("Yuriy",true,82);
        Human gdm2 = new Human("Shura",false,82);
        Human d = new Human("Oleg",true,51,gd1,gdm1);
        Human m = new Human("Olga",false,47,gd2,gdm2);
        Human c1 = new Human("Val",true,24,d,m);
        Human c2 = new Human("Julia",false,22,d,m);
        Human c3 = new Human("Alex",true,20,d,m);
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
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
