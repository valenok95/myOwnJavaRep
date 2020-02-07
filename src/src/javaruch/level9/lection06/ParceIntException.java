package src.javaruch.level9.lection06;

public class ParceIntException {
    public static void main(String[] args) {


        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getClass());
        }

    }
}
