package javaruch;

public class Cat {
    String name;
    int age;
    int weight;
    String color;
    String address;
    String anyColour = "anyColour"; //случайные значения
    int anyAge = 10;//случайные значения
    int midWeight = 4;//случайные значения

    public void initialize(String name) {
        this.name = name;
        this.age = anyAge;
        this.weight = midWeight;
        this.color = anyColour;
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = anyColour;
        this.address = null;
    }

    public void initialize(String name, int age) { // вес средний
        this.name = name;
        this.age = age;
        this.weight = midWeight;
        this.color = anyColour;
        this.address = null;
    }

    public void initialize(int weight, String colour) { // имя адрес возраст неизвестны(кот бездомный)
        this.name = null;
        this.age = anyAge;
        this.weight = weight;
        this.color = colour;
        this.address = null;
    }

    public void initialize(int weight, String colour, String address) { // чужой домашний кот
        this.name = null;
        this.age = anyAge;
        this.weight = weight;
        this.color = colour;
        this.address = address;
    }

    public Cat() {
    }

    /*public boolean fight2(Cat anotherCat) {
        int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
        int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
        int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

        int score = ageAdvantage + weightAdvantage + strengthAdvantage;
        return score > 2; // return score > 2 ? true : false;*/
    public boolean fight(Cat anotherCat) {
        int score = 0;
        if (this.age > anotherCat.age) {
            score++;
        } else if (this.age < anotherCat.age) {
            score--;
        }
        if (this.weight > anotherCat.weight) {
            score++;
        } else if (this.weight < anotherCat.weight) {
            score--;
        }
        return score > 0;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.weight = 5;
     //   cat1.strength = 20;
        Cat cat2 = new Cat();
        cat2.age = 1;
        cat2.weight = 8;
     //   cat2.strength = 20;
        cat1.fight(cat2);
        cat2.fight(cat1);

        System.out.println(cat2.fight(cat1));
        System.out.println(cat1.fight(cat2));

    }
}
