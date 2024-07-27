package Lec39Assignment9;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;
public class TreeTopView {
	class Node{
		int data;
		Node left;
		Node right;
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
		vertical(tm,0,this.root);
		for(int i:tm.keySet()) {
			System.out.print(tm.get(i).get(0)+" ");
		}
	}
	public void vertical(TreeMap<Integer,ArrayList<Integer>> tm,int hd,Node root) {
		if(root == null)return ;
		if(tm.containsKey(hd)) {
			ArrayList<Integer> temp = tm.get(hd);
			temp.add(root.data);
			tm.put(hd,temp);
		}else {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(root.data);
			tm.put(hd, temp);
		}
		vertical(tm, hd-1, root.left);
		vertical(tm, hd+1, root.right);
	}
	public static void main(String[] args) {
		TreeTopView tv = new TreeTopView();
		tv.takeInput();
		tv.verticalOrderTraversal();
	}

}
