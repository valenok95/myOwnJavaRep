package javaruch.level10.lecture04;

/**
 *  d=3.765
 */
public class CastingSercondTask {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c; // 1e-3=10 в минус третей степени

        System.out.println(d);
    }
}
