package Lec41;
import java.util.*;
class Pair {
	String psf;
	int vname;
	Pair(String psf,int vname){
		this.psf = psf;
		this.vname = vname;
	}
}
public class IsValidTree {
	public boolean validTree(int n,int[][] edges)
	{
		HashMap<Integer,Set<Integer>> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			map.put(i, new HashSet<>());
		}
		
		for(int i = 0;i<edges.length;i++) {
			int a = edges[i][0];
			int b = edges[i][1];
			// a mai b rakh denge aur b mai a rakhdenge
			map.get(a).add(b);
			map.get(b).add(a);
		}
		return bft(map);
	}
	public boolean bft(HashMap<Integer,Set<Integer>> map) {
		Set<Integer> processed = new HashSet<>();
		Queue<Pair>  queue     = new LinkedList<>();
		int count =0;
		
		
		for(int key:map.keySet()) {
			
			if(processed.contains(key)) {
				continue;
			}
			count++;
			
			//1. queue mai dalo
			queue.add(new Pair(key+"",key));
			// jab tak queue khali na ho
			
			while(!queue.isEmpty()) {
				Pair pair = queue.poll();
				
				//2. processed mai dalo
				
				processed.add(pair.vname);
				
				//3. Direct edge check kro  jo karna nahi hai bft mai 
				
				
				//cycle present hai agar true hoga to C wala case
				if(processed.contains(pair.vname)) {
					return false ;
				}
				
				//4. sare neighbours ko dalo vname ka
				ArrayList<Integer> nbrs = new ArrayList<>(map.get(pair.vname));
				for(int nbr:nbrs) {
					if(!processed.contains(nbr))
					queue.add(new Pair(pair.psf+nbr,nbr));
				}
			}
		}
		return count==1;
	}
	public static void main(String[] args) {
		
	}
	
}
