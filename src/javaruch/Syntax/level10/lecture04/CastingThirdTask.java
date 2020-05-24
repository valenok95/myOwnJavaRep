package javaruch.Syntax.level10.lecture04;

/**
 *  b = 0
 */
public class CastingThirdTask {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f); // проставил byte вместо int(256 cast to byte =0)
        System.out.println(b);
    }
}
