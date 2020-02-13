package javaruch.level09.lecture11.easy;

public class StaticExample {

    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        StaticExample room = new StaticExample();
        room.A = 5;

        StaticExample.D = 5;
    }

    public int getA() {
        return A;
    }

}
