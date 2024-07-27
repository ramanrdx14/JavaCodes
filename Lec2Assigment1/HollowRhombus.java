package Lec2Assigment1;
import java.util.*;
public class HollowRhombus {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n   = sc.nextInt();
        int rows= 1;
        int spaces = n-1;
        int stars  = n;
        while(rows <= n){
            int i = 1;
            while(i <= spaces){
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j <= stars){
                if(rows == 1 || rows == n || j == 1 || j == n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            rows++;
            spaces--;
            System.out.println();
        }
    }

}
