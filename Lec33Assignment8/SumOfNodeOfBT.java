package Lec33Assignment8;

public class SumOfNodeOfBT {
	class Node{
		Node left;
		Node right;
		Node data;
	}
	private boolean structurallyIdentical(Node tnode, Node onode) {
		if(tnode == null && onode == null)return true;
		if(tnode == null && onode != null || tnode != null && onode == null)return false;
		boolean ans1 = structurallyIdentical(tnode.left,onode.left);
		boolean ans2 = structurallyIdentical(tnode.right,onode.right);
		return ans1 && ans2;
	}
}
