package javaruch.level10.lecture04;
/**
nine=9
 **/
public class CastingForthTask {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println(Character.getNumericValue(nine));
        // вместо каста чар статик метод.
        nine = (Character.getNumericValue(zero) + number);
        System.out.println(nine);
        // либо такой каст
        nine = (zero + number);
        System.out.println((char)nine);

    }
}
