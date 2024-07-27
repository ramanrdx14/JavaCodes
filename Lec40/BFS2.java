package Lec40;
import java.util.*;
public class BFS2 {
	
	//-------------------GRAPH------CREATION-------------------------------------//
		HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
		
		public void addVertex(int v) {
			for(int i=1;i<=v;i++)
			{
				map.put(i, new HashMap<>());
			}
		}
		
		public void addEdge(int v1,int v2,int wt) {
			map.get(v1).put(v2, wt);
			map.get(v2).put(v1, wt);
		}
		
		public boolean containsEdge(int v1,int v2) {
			return map.get(v1).containsKey(v2);
		}
		
		public boolean containsVertex(int v1) {
			return map.containsKey(v1);
		}
		
		public void removeVertex(int v1) {
			for(int key:map.get(v1).keySet()) {
				map.get(key).remove(v1);
			}
			map.remove(v1);
		}
		
		public void removeEdge(int v1,int v2) {
			if(containsEdge(v1,v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
			}
		}
		
		
		
   //BFS--------------------------------------------------------------------//
		
    public boolean BFS(int src,int dst) {
    	Queue<Integer> queue = new LinkedList<>();
    	Set<Integer>   processed     = new HashSet<>();
    	
    	//1. queue mai add krdo pehle
    	queue.add(src);
    	
    	while(!queue.isEmpty()) {
    		//2. queue se remove kardo
    		int rp = queue.poll();
    		
    		//Self work
    		if(rp == dst) {
    			return true;
    		}
    		
    		
    		//3. agar rv pehle se processed mai hai tp cycle hai
    		if(processed.contains(rp)) {
    			continue;
    		}
    		
    		//4. processed mai daldo
    		processed.add(rp);
    		
    		//5. sare neighbours dalo jo ki unvisited hai
    		for(int nbr:map.get(rp).keySet()) {
    			if(!processed.contains(nbr)) {
    				queue.add(nbr);
    			}
    		}
    	}
    	return false;
    }
	
    
    
    public static void main(String[] args) {
		BFS2 graph = new BFS2();
		graph.addVertex(7);
		
		graph.addEdge(1, 2, 2);
		graph.addEdge(1, 2, 10);
		graph.addEdge(2, 3, 7);
		graph.addEdge(3, 4, 5);
		graph.addEdge(4, 5, 1);
		graph.addEdge(5, 6, 4);
		graph.addEdge(7, 5, 2);
		graph.addEdge(6, 7, 3);
		graph.removeEdge(1, 5);
		System.out.println(graph.BFS(1, 6));


	}

}
