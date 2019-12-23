package src.javaruch.lesson8.last;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NumberOfMonth {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mounth = reader.readLine();
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date date = dateFormat.parse(mounth+" 1 1970");
        int num=date.getMonth()+1;
        System.out.println(mounth+" is the "+num+" month");
        Map<Object,Object> map = new HashMap<>();
    }
}
