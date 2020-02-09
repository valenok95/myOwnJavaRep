package javaruch.level08.lection06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
 * Удалить из словаря всех людей, родившихся летом.
 */
public class Zinaida {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Альмухаметов", dateFormat.parse("NOVEMBER 4 1999"));
        map.put("Круглов", dateFormat.parse("DECEMBER 12 1999"));
        map.put("Антошкина", dateFormat.parse("JUNE 28 1997"));
        map.put("Жулябина", dateFormat.parse("JULY 27 1998"));
        map.put("Журавель", dateFormat.parse("AUGUST 29 1995"));
        map.put("Петров", dateFormat.parse("NOVEMBER 12 1992"));
        map.put("Иванов", dateFormat.parse("NOVEMBER 11 1992"));
        map.put("Смирнов", dateFormat.parse("NOVEMBER 13 1992"));
        map.put("Сидоров", dateFormat.parse("NOVEMBER 15 1992"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}
