package javaruch.Syntax.level07;
/**
 * Cat's name: Barsik, age: 6, weight: 5, tail: 22
 * Cat's name: Murka, age: 8, weight: 7, tail: 20
 */

import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(0);
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance / msDay);
        System.out.println("Days from start of year: " + dayCount);
    }
}