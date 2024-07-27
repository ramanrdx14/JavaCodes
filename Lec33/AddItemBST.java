package Lec33;
public class AddItemBST {
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
	public void addItem(int item) {
		this.root = addItem(root,item);
	}
	private Node addItem(Node root,int item) {
		if(root == null) {
			Node node = new Node();
			node.data = item;
			return node;
		}
		if(item > root.data) {
			root.right = addItem(root.right, item);
		}else {
			root.left  = addItem(root.left, item);
		}
		return root;
	}
	public static void main(String[] args) {
		AddItemBST ad = new AddItemBST();
		int[] arr = {10,20,30,40,50,60,70};
		ad.createBst(arr);
		ad.display();
		ad.addItem(5);
		ad.addItem(11);
		ad.display();
	}

}
