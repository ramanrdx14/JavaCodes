package Lec40;
import Lec40.Graph;
public class GraphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
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
		
//		graph.display();
//		System.out.println(graph.numberOfEdges());
//		System.out.println(graph.numVertex());
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		graph.removeEdge("A", "B");
//		graph.display();
//		graph.removeVertex("F");
//		graph.display();
		
		graph.printAllPaths("A","F","");
	}

}
