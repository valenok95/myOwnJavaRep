package src.javaruch;

public class Peoples {
    public static void main(String[] args) {
        Man man1 = new Man("Alex",25,"Moscow");
        Man man2 = new Man("Fox",19,"SPB");
        Woman woman1 = new Woman("Foxy",19,"SPB");
        Woman woman2 = new Woman("Lara",22,"Moscow");
        Man.getMan(man1);
        Man.getMan(man2);
        Woman.getWoman(woman1);
        Woman.getWoman(woman2);

    }

    public static class Man {
        String name, address;
        int age;
        public static void getMan(Man man){
            System.out.println(man.name + " " + man.age + " " + man.address);
        }

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
    }

    public static class Woman {
        String name, address;
        int age;
        public static void getWoman(Woman woman){
            System.out.println(woman.name + " " + woman.age + " " + woman.address);
        }
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
    }
}
