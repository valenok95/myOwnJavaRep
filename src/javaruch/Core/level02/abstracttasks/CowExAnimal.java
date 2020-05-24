package javaruch.Core.level02.abstracttasks;

/**
 * Реализуй все недостающие методы в классе Cow.
 */
public class CowExAnimal {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName(); // Необходимо реализовать в наследных классах данный абстрактный метод
    }

    public static class Cow extends Animal{
        public String getName(){
            return "Корова";
        }
    }
}
