package Lec33Assignment8;
import java.util.*;
public class PrintLeafNodes {
	class Node{
		int data;
		Node left;
		Node right;
		
	}
	Node root;
	public void createTree() {
		//Level order input
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		if(root == null) {
			Node node = new Node();
			node.data = sc.nextInt();
			root = node;
			q.add(node);
		}
		while(!q.isEmpty()) {
			Node element = q.poll();
			int leftdata = sc.nextInt();
			if(leftdata != -1) {
				Node left = new Node();
				left.data = leftdata;
				element.left = left;
				q.add(left);
			}
			int rightdata = sc.nextInt();
			if(rightdata != -1) {
				Node right = new Node();
				right.data = rightdata;
				element.right = right;
				q.add(right);
			}
		}
	}
	public void display() {
		display(root);
	}
	public void display(Node root)
	{
		if(root == null)return;
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}
	public void printAllLeaveNodes() {
		printAllLeaveNodes(root);
	}
	public void printAllLeaveNodes(Node root) {
		if(root == null)return ;
		if(root.left == null && root.right == null) {
			System.out.print(root.data+" ");
		}
		printAllLeaveNodes(root.left);
		printAllLeaveNodes(root.right);
	}
	public static void main(String[] args) {
		PrintLeafNodes pn = new PrintLeafNodes();
		pn.createTree();
		//pn.display();
		pn.printAllLeaveNodes();
	}
}
