package javaruch.Core.level02.abstracttasks;

public class CatDogExPet {

    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Кошка";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        public String getName() {
            return "Собака";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}
