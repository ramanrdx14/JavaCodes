package Lec6;

import java.util.*;
public class Celcius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lower  = sc.nextInt();
        int upper  = sc.nextInt();
        int steps  = sc.nextInt();
        for(int i=lower;i<=upper;i+=steps){
            int C = (int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+C);
        }
    }
}