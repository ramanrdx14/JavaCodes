package Lec24Assignment7;
import java.util.*;
public class PlayingWithCardsOnStack {
	public static void playingwithCards(Stack<Integer> stack,int queries) {
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();
		ArrayList<Integer> al = nthPrimeNumber();
		for(int i=1;i<=queries;i++) {
			int getprime = al.get(i-1);
			while(!stack.isEmpty()) {
				int X = stack.pop();
				if(X % getprime == 0) {
					B.push(X);
				}else {
					A.push(X);
				}
			}
			
				while(!B.isEmpty()) {
					System.out.println(B.pop());
				}
				stack = A;
			    A     = new Stack<>();
			}
			while(!stack.isEmpty()) {
	    	   System.out.println(stack.pop());
			}
		 
	}
	public static ArrayList<Integer> nthPrimeNumber(){
		ArrayList<Integer> al = new ArrayList<>();
		
		boolean[] arr = new boolean[100001];
		arr[0] = true;
		arr[1] = true;
		for(int i=2;i*i<100001;i++) {
			for(int mul=i;mul*i<100001;mul++) {
				arr[mul*i] = true;
			}
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i] == false) {
				al.add(i);
			}
		}
		return al;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n      = sc.nextInt();
		int q      = sc.nextInt();
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		playingwithCards(stack, q);
	}

}
