package javaruch.level07;

/**
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */
public class ManAndWoman {
    public static void main(String[] args) {
        Man man1 = new Man("Max", 25, "Moscow");
        Woman woman1 = new Woman("Jane", 22, "LA");
        System.out.println(man1.toString());
        System.out.println(woman1.toString());
        ;
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            String string = this.name + " " + this.age + " " + this.address;
            return string;

        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            String string = this.name + " " + this.age + " " + this.address;
            return string;
        }
    }
}
