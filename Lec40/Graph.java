package Lec40;
import java.util.*;
public class Graph {
	public class Vertex{
		HashMap<String,Integer> nbrs = new HashMap<>();
	}
	public HashMap<String,Vertex> vtcs;
	public Graph() {
		vtcs = new HashMap<>();
	}
	public int numVertex() {
		return this.vtcs.size();
	}
	public void addvertex(String vname) {

		this.vtcs.put(vname,new Vertex());
	}
	public boolean containVertex(String vname) {

		if(this.vtcs.containsKey(vname)) {
			return true;
		}else {
			return false;
		}
	}
	public void removeVertex(String vname1) {

		Vertex vtx1 = vtcs.get(vname1); //2k aya
		for(String s:vtx1.nbrs.keySet()) {
			Vertex vtxnbr = vtcs.get(s);
			vtxnbr.nbrs.remove(vname1);
		}
		
		vtcs.remove(vname1);
	}
	public int numberOfEdges() {

		int sumofedges = 0;
		for(String s:vtcs.keySet()) {
			sumofedges+=vtcs.get(s).nbrs.size();
		}
		return sumofedges/2;
	}
	public boolean containsEdge(String vname1,String vname2) {
		Vertex vtx1 = vtcs.get(vname1);
		Vertex vtx2 = vtcs.get(vname2);
		if(vtx1==null || vtx2== null) {
			return false;
		}
		if(vtx1.nbrs.containsKey(vname2) && vtx2.nbrs.containsKey(vname1)) {
			return true;
		}
		return false;
	}
	public void addEdge(String vname1,String vname2,int cost) {
		Vertex vtx1 = vtcs.get(vname1);//2k 
		Vertex vtx2 = vtcs.get(vname2);//4k
		if(vtx1==null || vtx2== null || vtx1.nbrs.containsKey(vname2) && vtx2.nbrs.containsKey(vname1)) {
			return;
		}
		
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}
	public void removeEdge(String vname1,String vname2) {
		Vertex vtx1 = vtcs.get(vname1);//2k 
		Vertex vtx2 = vtcs.get(vname2);//4k
		if(vtx1==null || vtx2== null || !vtx1.nbrs.containsKey(vname2) && !vtx2.nbrs.containsKey(vname1)) {
			return;
		}
		
		vtx1.nbrs.remove(vname2); // 2k nbrs remove  
		vtx2.nbrs.remove(vname1);
	}
	public void display() {
		System.out.println("-----------------------------------------------------");
		for(String vertices:vtcs.keySet()) {
			Vertex vtx1 = vtcs.get(vertices);
			System.out.println(vertices+"-->"+vtx1.nbrs);
		}
		System.out.println("-----------------------------------------------------");
	}
	

	
	//Hash path Method
	HashSet<String> processed = new HashSet<>();
	public boolean hasPath(String vname1,String vname2) {

		if(this.containsEdge(vname1, vname2)) {
			return true;
		}
		
		Vertex vtx = vtcs.get(vname1);
		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
			
			for(String nbr: nbrs) {
				
				if(!processed.contains(nbr)) { //mark karliye
				processed.add(vname1);
				
				if(hasPath(nbr, vname2)) {
					return true;
				    }
				}
				processed.remove(vname1);
			}
		return false;
	}
	
	
	
	//Print All paths
	public void printAllPaths(String vname1,String vname2,String ans) {
		if(vname1.equals(vname2)) {
			System.out.println(ans+"->"+vname2);
			return;
		}
		processed.add(vname1);
		
		Vertex vtx = vtcs.get(vname1);
		for(String nbr:vtx.nbrs.keySet()) {
			if(!processed.contains(nbr)) {
			printAllPaths(nbr, vname2, ans+"->"+vname1);
			}
		}
		processed.remove(vname1);
	}


	
	
	

}
