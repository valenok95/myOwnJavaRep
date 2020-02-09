package javaruch.level09.lection06;

public class BoundException {
    public static void main(String[] args) {


        int[] m = new int[2];
        try {

            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());;
        }


        //напишите тут ваш код
    }
}
