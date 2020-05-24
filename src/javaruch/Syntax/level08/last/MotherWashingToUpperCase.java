package javaruch.Syntax.level08.last;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotherWashingToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuffer buffer = new StringBuffer(string);
        char ch;
        buffer.replace(0,1,Character.toString(buffer.charAt(0)).toUpperCase()) ;
        for (int i=0;i<buffer.length();i++){
            ch=buffer.charAt(i);
            if (ch==' '){
                String toUpperCaseChar = Character.toString(buffer.charAt(i+1)).toUpperCase() ;
                buffer.replace(i+1,i+2,toUpperCaseChar);
            }
        }
        System.out.println(buffer.toString());
    }
}
