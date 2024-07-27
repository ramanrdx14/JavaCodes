package Lec39Assignment9;
import java.util.*;
public class KMostFrequentElements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		int k     = sc.nextInt();
		for(int i=0;i<arr.length;i++)arr[i]=sc.nextInt();
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		PriorityQueue<Pair>  pq= new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.value - o2.value;
			}
			
		});
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		for(int key:hm.keySet()) {
			pq.add(new Pair(key,hm.get(key)));
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		while(k-->0)al.add(pq.poll().key);
		Collections.sort(al);
		for(int i:al)System.out.print(i+" ");
	}

}
class Pair{
	int key;
	int value;
	Pair(int key,int val){
		this.key = key;
		this.value= val;
	}
	@Override
	public String toString() {
		return this.key+","+this.value;
	}
}