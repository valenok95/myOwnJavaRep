package javaruch.level10.lecture04;

/**
 Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567
 long l = (byte)1234_564_890L;
 int x = (byte)0b1000_1100_1010;
 double m = (byte)110_987_654_6299.123_34;
 float f = (byte)l++ + 10 + ++x - (float)m;
 l = (long) f / 1000;
 */
public class CastingSeventhTask {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        int x =  0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}
