package src.javaruch.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListTaskHardVer2 {
    static int indexMax, indexMin;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(read.readLine());
        }
        getFirstPick(list);
    }

    // getFirstPick;
    public static void getFirstPick(ArrayList<String> list) {
        int maxLength=list.get(list.size()-1).length();
        int minLength=list.get(list.size()-1).length();
        for (int i=list.size()-1;i>=0;i--){
            if(maxLength<list.get(i).length()){
                maxLength=list.get(i).length();
                indexMax=i;
            } else if (minLength>list.get(i).length()){
                minLength=list.get(i).length();
                indexMin=i;
            }
        }
        System.out.println(indexMax>indexMin ? list.get(indexMin):list.get(indexMax));
        }
    }
