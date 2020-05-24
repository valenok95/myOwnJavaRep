package animalsextencion;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}
