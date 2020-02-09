package javaruch.level09.lection06;

public class ThrowingDivideZeroException {
    public static void main(String[] args) {
        try {

            int a = 42 / 0;
        } catch (ArithmeticException e)
        {
            System.out.println(e.getClass());
        }
        //напишите тут ваш код
    }
}
