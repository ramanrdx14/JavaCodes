package Lec43;
import java.util.*;
class PrimsPair implements Comparable<PrimsPair>{
	int acqvtx;
	int mincost;
	int vtx;
	public PrimsPair(int vtx,int acqvtx,int cost) {
		this.vtx = vtx;
		this.acqvtx = acqvtx;
		this.mincost = cost;
	}
	@Override
	public int compareTo(PrimsPair o) {
		
		return this.mincost - o.mincost;
	}
	
	@Override
	public String toString() {
		
		return this.vtx+" "+this.acqvtx+" @ "+this.mincost;
	}
}
public class Prims {
  HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap();
  public void addVertex(int v) {
	  for(int i=1;i<=v;i++) {
		  map.put(i, new HashMap<Integer,Integer>());
	  }
  }
  
  public void addEdge(int vname1,int vname2,int cost) {
	  map.get(vname1).put(vname2, cost);
	  map.get(vname2).put(vname1, cost);
  }
  
  public void primsAlgo(){
	  PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
	  Set<Integer> visited      = new HashSet<>();
	  
	  //Kisi bhi pair se start karo no problem
	  pq.add(new PrimsPair(3,3,0));
	  
	  while(!pq.isEmpty()) {
		  PrimsPair rp = pq.poll();
		  
		  if(visited.contains(rp.vtx)) {
			  continue;
		  }
		  
		  visited.add(rp.vtx);
		  
		  System.out.println(rp);
		  
		  for(int nbr:map.get(rp.vtx).keySet()) {
			  if(!visited.contains(nbr)) {
			  int cost = map.get(rp.vtx).get(nbr);
			  pq.add(new PrimsPair(nbr,rp.vtx,cost));
			  }
		  }
	  }
	  
  }
  public static void main(String[] args) {
	Prims p = new Prims();
	p.addVertex(7);
	p.addEdge(1, 2, 2);
	p.addEdge(1, 4, 5);
	p.addEdge(2, 3, 3);
	p.addEdge(4, 3, 4);
	p.addEdge(4, 5, 7);
	p.addEdge(5, 6, 1);
	p.addEdge(5, 7, 6);
	p.addEdge(6, 7, 8);
	//System.out.println(p.map);
	p.primsAlgo();
  }
}
