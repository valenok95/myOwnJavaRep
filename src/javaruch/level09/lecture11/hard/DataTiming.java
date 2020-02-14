package javaruch.level09.lecture11.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Ввести с клавиатуры дату в формате "2013-08-18"
 * Вывести на экран введенную дату в виде "AUG 18, 2013".
 * Воспользоваться объектом Date и SimpleDateFormat.
 */
// Знакомство с форматтером! SimpleDateFormat годная тема
public class DataTiming {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringData = reader.readLine();
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        //LocalDate date1 = LocalDate.parse(stringData); так тоже можно
        Date date = formatter1.parse(stringData);

        System.out.println(formatter2.format(date).toUpperCase());
    }
}
