package Lec31;
import java.util.*;
public class BinaryTree {
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree() {
		root = createTree(null,true);
	}
	public Node giveRoot() {
		return root;
	}
	private Node createTree(Node parent,boolean hlc) {
		if(parent == null) {//matlab yahi root node hai
			System.out.println("Enter the root data :");
		}else {
			if(hlc) { //agar left child hai to
				System.out.println("Enter left child for  :"+parent.val);
			}else { // agar child right hai to
				System.out.println("Enter right child for :"+parent.val);
			}
		}
		
		//input lane k liye aur node mai data set karne keliye
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		
		System.out.println(nn.val+" :has Left Child ?");
		boolean hasLeftChild = sc.nextBoolean();
		if(hasLeftChild) {
			nn.left = createTree(nn, true);
		}
		
		System.out.println(nn.val+" :has Right Child ?");
		boolean hasRightChild = sc.nextBoolean();
		if(hasRightChild) {
			nn.right= createTree(nn, false);
		}
		return nn;
	}
	
	public void display() {
		display(root);
	}
	private void display(Node root) {
		if(root == null) {
			return;
		}
		String s = "";
		s= "<--"+root.val+"-->";
		if(root.left != null) {
			s= root.left.val+s;
		}else {
			s="."+s;
		}
		
		if(root.right != null) {
			s= s+root.right.val;
		}else {
			s=s+".";
		}
		System.out.println(s);
		display(root.left);
		display(root.right);
	}
	
	/****************************SIZE OF BINARY TREE*********************************/
	public  int getSize() {return getSize(root);}
	private int getSize(Node root) {
		if(root == null) {
			return 0;
		}
		int leftsmallerproblemans = getSize(root.left);
		int rightsmallerproblemans= getSize(root.right);
		return leftsmallerproblemans + rightsmallerproblemans + 1;
	}
	
	
	
	/****************************SIZE OF BINARY TREE*********************************/
	
	
	
	
	
	
	
	
	/****************************MAX OF BINARY TREE*********************************/
	public  int max() {
		return max(root);
	}
	
	private int max(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int rootdata= root.val;
		int leftval = max(root.left);
		int rightval= max(root.right);
		return Math.max(leftval, Math.max(rightval,rootdata));
		
	}
	/****************************MAX OF BINARY TREE*********************************/
	
	
	
	
	
	
	/****************************FIND ITEM BINARY TREE*********************************/
	public boolean findItem(int item) {
		return findItem(root,item);
	}
	public boolean findItem(Node root,int item) {
		if(root==null) {
			return false;
		}
		if(root.val == item)return true;
		
		boolean leftfind  = findItem(root.left,item);
		boolean rightfind = findItem(root.right,item);
		return leftfind || rightfind;
	}
	
	
	/****************************FIND ITEM BINARY TREE*********************************/
	
	
	
	
	
	/****************************Height BINARY TREE*********************************/
	public int heightOfBinaryTree() {
		return heightOfBinaryTree(root);
	}
	private int heightOfBinaryTree(Node root) {
		if(root == null) {
			return -1;
		}
		int heightleft  = heightOfBinaryTree(root.left);
		int heightright = heightOfBinaryTree(root.right);
		return Math.max(heightleft, heightright)+1;
	}

	/****************************Height BINARY TREE*********************************/
	
	
	
	
	
	
	
	/****************************Diameter BINARY TREE*********************************/
	
	private int findHeight(Node root) {
		if(root == null)return -1;
		int leftsubtreeheight = findHeight(root.left);
		int rightsubtreeheight= findHeight(root.right);
		return Math.max(leftsubtreeheight, rightsubtreeheight)+1;
	}
	
	int dimeterterrevious = Integer.MIN_VALUE;
	public int diameter1() {
		diameter1(root);
		return dimeterterrevious;
	}
	private void diameter1(Node root) {
		if(root == null) {
			return;
		}
		int diameter = findHeight(root.left) + findHeight(root.right) + 2;
		diameter1(root.left);
		diameter1(root.right);
		if(diameter > dimeterterrevious) {
			dimeterterrevious = diameter;
		}
	}
	

	
	
	public int findDiameter2() {
		return findDiameter2(root);
	}
	private int findDiameter2(Node root) {
		if(root == null) {
			return 0;
		}
		
		//maximum distance between two leaf node might lie in leftsubtree:left ka dimeter
		int leftdimeter = findDiameter2(root.left);
		
		//maximum distance between two leaf node might lie in rightsubtree:right ka dimeter
		int rightdimater= findDiameter2(root.right);
		
		
		//self node might be the root node the diameter 
		int rootdimeter = findHeight(root.left) + findHeight(root.right)+ 2;
		return Math.max(Math.max(leftdimeter, rightdimater),rootdimeter);
	}
	
	/****************************Diameter BINARY TREE*********************************/
	public void preordertraversal() {
		preordertraversal(root);
	}
	private void preordertraversal(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.val+" ");
		preordertraversal(root.left);
		preordertraversal(root.right);
	}
	
	
	
	public void inordertraversal() {
		inordertraversal(root);
	}
	private void inordertraversal(Node root) {
		if(root == null) {
			return ;
		}
		
		preordertraversal(root.left);
		System.out.print(root.val+" ");
		preordertraversal(root.right);
	}
	
	
	public void postTraversal() {
		postTraversal(root);
	}
	private void postTraversal(Node root) {
		if(root == null) {
			return ;
		}
		
		preordertraversal(root.left);
		preordertraversal(root.right);
		System.out.print(root.val+" ");
	}
	
	
	public void levelOderTraversal() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node nn = queue.poll();
			System.out.print(nn.val+" ");
			if(nn.left != null) {
				queue.add(nn.left);
			}
			if(nn.right != null) {
				queue.add(nn.right);
			}
		}
	}
}
