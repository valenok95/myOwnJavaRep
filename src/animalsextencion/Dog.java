package animalsextencion;

public class Dog extends Animal {

    Dog(String name){
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("Гав-гав!");
    }
}
