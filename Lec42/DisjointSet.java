package Lec42;
import java.util.*;
public class DisjointSet {
	private class Node{
		int data;
		Node parent;
		int rank;
	}
	HashMap<Integer,Node> map = new HashMap<>();
	public void createSet(int value) {
		Node nn = new Node();
		nn.data = value;
		nn.parent=nn;
		nn.rank =0;
		
		map.put(value, nn);
	}
	
	public void union(int value1,int value2) {
		Node n1 = map.get(value1);
		Node n2 = map.get(value2);
		
		Node re1 = find(n1);  //representative element
		Node re2 = find(n2); //representative element
		
		//Agar dono ka representative element same hua to cycle hai
		if(re1.data == re2.data) {
			return;
		}else {
		//ab check karenge dono mai se kiska rank kam hai jiska rank kam hoga uska parent update krdo
		
		if(re1.rank == re2.rank) {
			  re2.parent = re1.parent;
			  re1.rank   = re1.rank + 1;
		}else if(re1.rank > re2.rank){
			re2.parent = re1;
		}else {
			re1.parent = re2;
			
		}
	}
}
	
	public int find(int value1) {
		Node fn = map.get(value1);
		return find(fn).data;
	}
	public Node find(Node node) {
		if(node == node.parent) {
			return node;
		}
		Node rr = find(node.parent);
		rr.parent = rr;
		return rr;
	}
	
}

