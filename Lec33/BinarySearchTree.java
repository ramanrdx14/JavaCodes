package Lec33;

public class BinarySearchTree {
	class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public void createBst(int[] arr) {
		this.root = createBst(0,arr.length-1,arr);
	}
	public Node createBst(int lo,int hi,int[] arr) {
		 if(lo > hi) {
			return null;
		 }
		 int mid = (lo+hi)/2;
		 Node node = new Node();
		 node.data = arr[mid];
		 node.left = createBst(lo,mid-1,arr);
		 node.right= createBst(mid+1,hi,arr);
		 return node;
	}
	public void display() {
		display(root);
	}
	public void display(Node root) {
		if(root == null)return ;
		String str = "";
		if(root.left == null) {
			str+=".";
		}else {
			str+=root.left.data;
		}
		
		str+="<--"+root.data+"-->";
		
		if(root.right == null) {
			str+=".";
		}else {
			str+=root.right.data;
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
		
	}
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();

		int[] arr = {10,20,30,40,50,60,70};
		b.createBst(arr);
		b.display();
	}
}
