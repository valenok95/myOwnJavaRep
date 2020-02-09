package javaruch.level09.lection08;

import java.io.IOException;

public class MyExceptions {

    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends MyException3 {
    }
}
