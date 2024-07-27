package Lec40;
import Lec40.Graph;
import Lec40.Graph.Vertex;

import java.util.*;
class Pair1{
	String vname;
	String psf;
	Pair1(String vname,String psf){
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
public class DepthFirstSearch {
	static Graph graph;
	public boolean bfs(String src, String dst) {
		Stack<Pair4> stack = new Stack<>();
		Set<String> processed = new HashSet<>();
		
		Pair4 pair = new Pair4(src,src);	
		stack.add(pair);
		while(!stack.isEmpty()) {
			
			//queue is remove
			Pair4 vtx  = stack.pop();
			
			if(processed.contains(vtx.vname)) { //multiple C vertex hoga to
				continue;
			}
			
			//processed mai dalo
			processed.add(vtx.vname);
			
			
			//direct edge check kro source se destination tak
			if(graph.containsEdge(vtx.vname, dst))
			{
				System.out.println(vtx.psf+dst);
				return true;
			}
			
			//sare neighbour dalo queue mai 
			Vertex rpvtx = graph.vtcs.get(vtx.vname);
			ArrayList<String> nbrs  = new ArrayList<>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				stack.push(new Pair4(nbr,vtx.psf+nbr));
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		graph = new Graph();;
		graph.addvertex("A");
		graph.addvertex("H");
		graph.addvertex("C");
		graph.addvertex("D");
		graph.addvertex("E");
		graph.addvertex("F");
		graph.addvertex("G");
		
		graph.addEdge("A", "H", 2);
		graph.addEdge("A", "D", 2);
		graph.addEdge("H", "C", 2);
		graph.addEdge("C", "D", 2);
		graph.addEdge("D", "E", 2);
		graph.addEdge("E", "F", 2);
		graph.addEdge("E", "G", 2);
		graph.addEdge("F", "G", 2);
		DepthFirstSearch bfs = new DepthFirstSearch();
		System.out.println(bfs.bfs("A","F"));
		
	}
}
