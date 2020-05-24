package javaruch.Syntax.level09.lection08;

/**
 * В методе handleExceptions обработайте все unchecked исключения.
 * Нужно вывести стек-трейс возникшего исключения используя метод printStack.
 * Можно использовать только один блок try..catch
 */
public class UncheckedCatch {

    public static void main(String[] args) {
        handleExceptions(new UncheckedCatch());
    }

    public static void handleExceptions(UncheckedCatch obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch(Error | RuntimeException e)
        {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
