package Lec42;
import java.util.*;
public class Kruskals {
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
	private class EdgePair implements Comparable<EdgePair>{
		int vtx1;
		int vtx2;
		int cost;
		@Override
		public int compareTo(EdgePair o) {
			return this.cost-o.cost;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return vtx1+"_"+vtx2+"@"+cost;
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
	
	public void Kruskals() {
		ArrayList<EdgePair> edges = getAllEdges();
		Collections.sort(edges);
		
		//Create Set
		DisjointSet ds = new DisjointSet();
		for(int i=1;i<=7;i++) {
			ds.createSet(i);
		}

		//check karna hai ka e set alag alag ko belog karte ya same
		for(EdgePair ep :edges) {
		    int rp1 = ds.find(ep.vtx1);
		    int rp2 = ds.find(ep.vtx2);
		    
		    if(rp1 == rp2) {
		    	continue;
		    }else {
		    	System.out.println(ep);
		    	ds.union(ep.vtx1, ep.vtx2);
		    }
		}
	}
	public static void main(String[] args) {
		Kruskals k = new Kruskals();
		k.addVertex(7);
		
		k.addEdge(1, 2, 3);
		k.addEdge(1, 4, 4);
		k.addEdge(2, 3, 5);
		k.addEdge(3, 4, 6);
		k.addEdge(4, 5, 8);
		k.addEdge(5, 6, 2);
		k.addEdge(6, 7, 9);
		k.addEdge(7, 5, 1);
		
		k.Kruskals();

		
		
		
		
		
		
	}

}
