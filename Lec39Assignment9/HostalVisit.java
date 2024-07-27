package Lec39Assignment9;
import java.util.*;
public class HostalVisit {

	public static void main(String args[]) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);

        long q = sc.nextLong();
        int k = sc.nextInt();
        while(q-->0){
        long c = sc.nextLong();
        if(c == 1){
            long x = sc.nextLong();
            long y = sc.nextLong();
            pq.add((x*x)+(y*y));
            if(pq.size()>k) {
            	pq.poll();
            }
        }else{
            System.out.println(pq.poll());
           }
        }
    }

}
