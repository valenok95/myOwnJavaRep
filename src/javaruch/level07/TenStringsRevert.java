package javaruch.level07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TenStringsRevert {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        // list.set(0, reader.readLine());
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
