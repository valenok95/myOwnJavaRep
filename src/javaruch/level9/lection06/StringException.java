package javaruch.level9.lection06;

public class StringException {
    public static void main(String[] args) {


        try {
            String s = null;
            String m = s.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println(e.getClass());
        }


    }
}
