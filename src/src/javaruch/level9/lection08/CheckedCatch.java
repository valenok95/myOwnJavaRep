package src.javaruch.level9.lection08;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * В методе handleExceptions обработайте все checked исключения.
 * Нужно вывести на экран возникшее checked исключение.
 * Можно использовать только один блок try..catch
 */
public class CheckedCatch {

    public static void main(String[] args) {
        handleExceptions(new CheckedCatch());

    }

    public static void handleExceptions(CheckedCatch obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
