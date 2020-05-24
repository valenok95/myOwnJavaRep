package javaruch.Syntax.level09.lecture11.easy;

/**
 *         Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
 * Обернуть вызов sleep в try..catch.
 */
public class SleepComing {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
