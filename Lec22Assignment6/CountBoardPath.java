package Lec22Assignment6;
import java.util.*;
public class CountBoardPath {
	static int count =0;
    public static void count(int n,int m,int sc,String result)
    {   if(sc == n){
        System.out.print(result+" ");
        count++;
        return;
         }
       if(sc > n){
           return;
         }
        for(int i=1;i<=m;i++){
            count(n,m,sc+i,result+i);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n      = sc.nextInt();  
        int m      = sc.nextInt();
        count(n,m,0,"");
        System.out.println("\n"+count);
    }
	
	
}
