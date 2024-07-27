package Lec35;
import java.util.*;
public class BusyMan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t--> 0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = new Pair(sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(arr,new Comparator<Pair>() {
				@Override
				public int compare(Pair o1, Pair o2) {
					return o1.end-o2.end;					
				}
			});
			int count = 1;
			int checkwork= arr[0].end;
			for(int i=1;i<arr.length;i++) {
				if(checkwork <= arr[i].start) {
					checkwork = arr[i].end;
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}
class  Pair{
	int start;
	int end;
	Pair(int start,int end){
		this.start = start;
		this.end   = end;
	}
	@Override
	public String toString() {
		
		return this.start+" "+this.end;
		
	}
}