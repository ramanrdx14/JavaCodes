package Lec40;
import Lec40.Graph;
import Lec40.Graph.Vertex;

import java.util.*;
class Pair4{
	String vname;
	String psf;
	Pair4(String vname,String psf){
		this.vname =vname;
		this.psf   =psf;
	}
	
}
/*
	1.  queue se remove
	2.  processed mai dalo
	3.  direct edge hai ya ni ye check kro
	4. neighbours ka pair banao aur queue mai push krdo
 
 */
public class DFT {
	static Graph graph;
	public void bfs() {
		Stack<Pair1> stack = new Stack<>();
		Set<String> processed = new HashSet<>();
		
		for(String keys:graph.vtcs.keySet()) {
			
		if(processed.contains(keys))
			{
				continue;
			}
		
		
		Pair1 pair = new Pair1(keys,keys);	
		stack.add(pair);
		while(!stack.isEmpty()) {
			
			//queue is remove
			Pair1 vtx  = stack.pop();
			
			if(processed.contains(vtx.vname)) { //multiple C vertex hoga to
				continue;
			}
			
			//syso statement
			System.out.println(vtx.vname+" "+vtx.psf);
			
			
			//processed mai dalo
			processed.add(vtx.vname);
			
			
			//sare neighbour dalo queue mai 
			Vertex rpvtx = graph.vtcs.get(vtx.vname);
			ArrayList<String> nbrs  = new ArrayList<>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				stack.push(new Pair1(nbr,vtx.psf+nbr));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		graph = new Graph();;
		graph.addvertex("A");
		graph.addvertex("B");
		graph.addvertex("C");
		graph.addvertex("D");
		graph.addvertex("E");
		graph.addvertex("F");
		graph.addvertex("G");
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 2);
		graph.addEdge("B", "C", 2);
		graph.addEdge("C", "D", 2);
		graph.addEdge("D", "E", 2);
		graph.addEdge("E", "F", 2);
		graph.addEdge("E", "G", 2);
		graph.addEdge("F", "G", 2);

		//graph.removeEdge("D", "E"); // agar graph ko disconnected karde to 
		DFT bfs = new DFT();
		bfs.bfs();
		
	}
}
