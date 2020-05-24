package javaruch.Core.level02.overridetasks;

public class TypeDetection {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //System.out.println(o.getClass().getSimpleName());
       if( o instanceof Cat){
           System.out.println("Кошка");
        } else
       if( o instanceof Dog){
           System.out.println("Собака");
        } else
       if( o instanceof Bird){
           System.out.println("Птица");
        } else
       if( o instanceof Lamp){
           System.out.println("Лампа");
        }

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
