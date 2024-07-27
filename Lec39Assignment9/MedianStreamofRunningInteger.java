package Lec39Assignment9;
import java.util.*;
public class MedianStreamofRunningInteger {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
			PriorityQueue<Integer> left = new PriorityQueue<>();
			PriorityQueue<Integer> right= new PriorityQueue<>();
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				int num = sc.nextInt();
				if(left.size() == 0 || left.peek() < num) {
					left.add(num);
				}else {
					right.add(num);
				}
				
				if(Math.abs(left.size() - right.size()) > 1){
		            right.add(left.poll());
		        }else if(left.size() < right.size()){
		            left.add(right.poll());
		        }
				
				if(left.size() == right.size()) {
					System.out.print((left.peek()+right.peek())/2+" ");
				}else {
					System.out.print(left.peek()+" ");
				}
			}
		}
	}

}
