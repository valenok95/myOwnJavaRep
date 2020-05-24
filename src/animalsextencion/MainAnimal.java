package animalsextencion;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat("Мура");
        Animal dog = new Dog("Зевс");
        AnimalBarbershop barbershop = new AnimalBarbershop();
        barbershop.shear(dog);
        barbershop.shear(cat);
        cat.voice();
    }
}
