package Lec39Assignment9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
public class TreeBottomView {

	class Node{
		int data;
		Node left;
		Node right;
		Integer hd=0;
	}
	Node root = null;
	Scanner sc = new Scanner(System.in);
	public Node takeInput() {
		Queue<Node> q = new LinkedList<>();
		if(root == null)
		{
			int n = sc.nextInt();
			Node node = new Node();
			node.data = n;
			root = node;
			q.add(node);
		}
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				Node left = new Node();
				left.data = leftchild;
				temp.left = left;
				q.add(left);
			}
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				Node right = new Node();
				right.data = rightchild;
				temp.right = right;
				q.add(right);
			}
		}
		return root;
	}
	public void verticalOrderTraversal() {
		TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node node = q.poll();
			if(tm.containsKey(node.hd)) {
				ArrayList<Integer> al = tm.get(node.hd);
				al.add(node.data);
			}else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(node.data);
				tm.put(node.hd,al);
			}
			
			if(node.left != null) {
				node.left.hd = node.hd -1;
				q.add(node.left);
			}
			
			if(node.right != null) {
				node.right.hd = node.hd +1;
				q.add(node.right);
			}
		}
		for(int i:tm.keySet()) {
			ArrayList<Integer> temp = tm.get(i);
			System.out.print(temp.get(temp.size()-1)+" ");
		}
	}
	
	public static void main(String[] args) {
		TreeBottomView tb = new TreeBottomView();
		tb.takeInput();
		tb.verticalOrderTraversal();
	}

}
