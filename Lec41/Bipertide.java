package Lec41;
import java.util.*;
class Pair4{
	int vname;
	int dist;
	Pair4(int vname,int dist){
		this.vname = vname;
		this.dist  = dist;
	}
}
public class Bipertide {
	
	public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
		Queue<Pair4> queue = new LinkedList<>();
		HashMap<Integer,Integer> processed = new HashMap<>();
		
		for(int key=0;key<V;key++) {
			
			if(processed.containsKey(key)) {
				continue;
			}
			
			//1. Queue mai dalo
			queue.add(new Pair4(key,0));
			
			while(!queue.isEmpty()) {
				Pair4 rp = queue.poll();
				
				//cycle check aur ye bhi dekh rahe ki cycle ka length even ya odd
				if(processed.containsKey(rp.vname)) {
					int dist =  processed.get(rp.vname);
					if(dist != rp.dist) {
						return false;
					}
				}
				
				//2. processed mai dalo
				processed.put(rp.vname,rp.dist);
				
				
				//3. direct edge check
				
				
				//4. sare neighbour ko dalo
				for(int nbr:adj.get(rp.vname)) {
					if(!processed.containsKey(nbr))
					queue.add(new Pair4(nbr,rp.dist+1));
				}
			}
		}
		return true;
    }
}
