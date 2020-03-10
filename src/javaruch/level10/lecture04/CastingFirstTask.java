package javaruch.level10.lecture04;
/**
 *  d>0
 */
public class CastingFirstTask {

        public static void main(String[] args) {
            int a = 0;
            int b = (byte) a + 46; // a=0 b=46
            byte c = (byte) (a * b); // c=0
            double f = (char) 1234.15; // f=1234.0
            long d = (long) (a + f / c + b); // infinity
            System.out.println(d);
        }
    }
