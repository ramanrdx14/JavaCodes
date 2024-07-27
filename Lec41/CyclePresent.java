package Lec41;
import java.util.*;
public class CyclePresent {

	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0;i<V;i++) {
        	map.put(i, adj.get(i));
        }
        
        return bft(map);
    }
	
	public boolean bft(HashMap<Integer,ArrayList<Integer>> map) {
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> processed = new HashSet<>();
		for(int key:map.keySet()) {
			if(processed.contains(key)) {
				continue;
			}
			//1. queue mai add kro
			queue.add(key);
			
			//queue jab tak kahali na hokam karna hai
			while(!queue.isEmpty()) {
				int rp = queue.poll();
				
				//cycle hai ya nahi
				if(processed.contains(rp)) {
					return true;
				}
				
				//2. processed mai dalo
				processed.add(rp);
				
				
			   //3. direct edge
				
				
				//4. rv ke sare neighbour dalo
				for(int nbr:map.get(rp)) {
					if(!processed.contains(nbr)) {
						queue.add(nbr);
					}
				}
			}
		}
		return false;
	}

}
