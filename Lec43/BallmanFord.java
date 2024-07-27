package Lec43;
import java.util.*;

public class BallmanFord {
	HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap();
	  public void addVertex(int v) {
		  for(int i=1;i<=v;i++) {
			  map.put(i, new HashMap<Integer,Integer>());
		  }
	  }
	  
	  //Directed Graph
	  public void addEdge(int vname1,int vname2,int cost) {
		  map.get(vname1).put(vname2, cost);
		  
	  }
		private class EdgePair{
			int vtx1;
			int vtx2;
			int cost;
			public String toString() {
				// TODO Auto-generated method stub
				return vtx1+"--->"+vtx2+"@"+cost;
			}
		}
		public ArrayList<EdgePair> getAllEdges(){
			ArrayList<EdgePair> edges = new ArrayList<>();
			for(int key:map.keySet()) {
				HashMap<Integer,Integer> vtcs = map.get(key);
				for(int nbr:vtcs.keySet()) {
					EdgePair ep = new EdgePair();
					ep.vtx1  = key;
					ep.vtx2  = nbr;
					ep.cost  = vtcs.get(nbr);
					
					edges.add(ep);
				}
			}
			return edges;
		}
		
		public int[] ballmanFordAlgo(int src) {
			int v  = map.size();
			//initial distance ke liye
			int[] dist = new int[v+1];
			for(int i=1;i<=v;i++) {
				dist[i] = 10000000;
			}
			
			dist[src] = 0;
			
			List<EdgePair> ll = getAllEdges();
			
			
			//is process ko v-1 times chalana hai 
			for(int i=1;i<=v;i++) {
			for(EdgePair ep:ll) {
				
				int bc_vtx2 = dist[ep.vtx2]; //before cost of vtx2
				int bc_vtx1 = dist[ep.vtx1];
				int vtx1_vtx2_cost = ep.cost;
				
				
				if(i == v && bc_vtx2 > bc_vtx1+vtx1_vtx2_cost) {
					System.out.println("-ve Weight Cycle Detected !!");
					return null;
				}
				if(bc_vtx2 > bc_vtx1+vtx1_vtx2_cost) {
					dist[ep.vtx2] = bc_vtx1+vtx1_vtx2_cost;
				}
			}
		 }
			return dist;
	 }
		public static void main(String[] args) {
			BallmanFord bf = new BallmanFord();
			bf.addVertex(5);
			bf.addEdge(1, 2, 8);
			bf.addEdge(1, 3, 4);
			bf.addEdge(1, 4, 5);
			bf.addEdge(3, 4, -3);
			bf.addEdge(4, 5, 4);
			bf.addEdge(5, 2, 1);
			bf.addEdge(2, 5, -2);
			
			int[] dist = bf.ballmanFordAlgo(1);
			if(dist == null) {
				return;
			}
			for(int i:dist) {
				System.out.print(i+" ");
			}
		}
		
}
