package javaruch.level09.lection01;

public class Logger {

    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() +" : \n"+ Thread.currentThread().getStackTrace()[2].getMethodName()+" : "+s);
    }
}
