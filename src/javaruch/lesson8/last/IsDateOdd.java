package javaruch.lesson8.last;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IsDateOdd {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date thisDate = dateFormat.parse(date);
        Date yearTime = dateFormat.parse(date);
        yearTime.setHours(0);
        yearTime.setMinutes(0);
        yearTime.setSeconds(0);
        yearTime.setDate(1);
        yearTime.setMonth(0);
        long millsOfCurrentYear = thisDate.getTime()-yearTime.getTime();
        long millsInDay=(1000*60)*60*24; // сутки
        long dayCount= millsOfCurrentYear/millsInDay;
        return dayCount%2==0;
    }
}
