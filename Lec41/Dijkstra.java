package Lec41;
import java.util.*;
public class Dijkstra {
	HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	class Pair implements Comparable<Pair>{
		int vname;
		int cost;
		String psf;
		@Override
		public int compareTo(Pair o) {
			
			return this.cost - o.cost;
		}
		
		@Override
		public String toString() {
			return this.vname+"-->"+this.psf+"@"+this.cost;
		}
		 
	 }
	
		public void addVertex(int v) {
			for(int i=1;i<=v;i++) {
				map.put(i, new HashMap<>());
			}
		}
		
		public void addEdge(int vname1,int vname2,int cost) {
			map.get(vname1).put(vname2, cost);
			map.get(vname2).put(vname1, cost);
		}
	
	public void dijkstra(int src,HashMap<Integer,HashMap<Integer,Integer>> map) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		Set<Integer> visited = new HashSet<>();
		
		//1. pq mai add kro pair ko
		Pair pair = new  Pair();
		pair.cost = 0;
		pair.psf  = "";
		pair.vname= src;
		
		pq.add(pair);
		
		while(!pq.isEmpty()) {
			//2. Pair ko remove kardo
			Pair rp = pq.poll();
			
			//3. agar pehle se visited mai hai matlb cycle hai to ignore kardo
			if(visited.contains(rp.vname)) {
				continue;
			}
			
			//4. visited mai dal do
			visited.add(rp.vname);
			
			//5. self  work;
			System.out.println(rp);
			
			//6.sare nbrs ko dalo
			for(int nbr:map.get(rp.vname).keySet()) {
				
				if(!visited.contains(nbr)) {
				Pair nbrpair = new Pair();
				nbrpair.cost = rp.cost+map.get(rp.vname).get(nbr);
				nbrpair.vname= nbr;
				nbrpair.psf  = rp.psf+nbr;
				
				pq.add(nbrpair);
				}
			}
		}
	}
	public static void main(String[] args) {
		Dijkstra dj = new Dijkstra();
		dj.addVertex(7);
		dj.addEdge(1, 2, 3);
		dj.addEdge(2, 3, 5);
		dj.addEdge(3, 4, 7);
		dj.addEdge(4, 1, 2);
		dj.addEdge(4, 5, 6);
		dj.addEdge(5, 6, 11);
		dj.addEdge(6, 7, 3);
		dj.addEdge(7, 5, 1);
		
		dj.dijkstra(1, dj.map);
	}

}
