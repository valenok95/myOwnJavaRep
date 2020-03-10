package javaruch.level10.lecture11;

/**
 * Вывести на экран надпись "Я не хочу изучать Java, я хочу большую зарплату" 40 раз по образцу.
 *
 * Образец:
 * Я не хочу изучать Java, я хочу большую зарплату
 *  не хочу изучать Java, я хочу большую зарплату..
 *  ....
 *  .
 *  .
 *  .
 */
public class BigSalary {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        StringBuffer buffer = new StringBuffer(s);
       for(int i=0;i<40;i++){
            System.out.println(buffer.toString());
            buffer.deleteCharAt(0);
        }

    }
}
