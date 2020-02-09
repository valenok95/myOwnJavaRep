package javaruch.unsortedtasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ActualDate {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int tmp;
        int maximum ;
        maximum=Integer.parseInt(reader.readLine());
        for(int i=1;i<n;i++){
            tmp=Integer.parseInt(reader.readLine());
                if(tmp>maximum){
                    maximum=tmp;
            }

        }
        System.out.println(maximum);
    }
}
