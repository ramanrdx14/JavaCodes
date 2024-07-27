package Lec31;
import java.util.*;
class Node{
	Node left;
	Node right;
	int data;
}
class BallPair{
	boolean isBallence = true;
	int height = -1;
}
public class CheckTreeBallenced {
	public Node root;
	Scanner sc = new Scanner(System.in);
	public void createTree() {
		root = createTree(null, false);
	}
	private Node createTree(Node parent,boolean hlc) {
		if(parent == null) {//matlab yahi root node hai
			System.out.println("Enter the root data :");
		}else {
			if(hlc) { //agar left child hai to
				System.out.println("Enter left child for  :"+parent.data);
			}else { // agar child right hai to
				System.out.println("Enter right child for :"+parent.data);
			}
		}
		
		//input lane k liye aur node mai data set karne keliye
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		
		System.out.println(nn.data+" :has Left Child ?");
		boolean hasLeftChild = sc.nextBoolean();
		if(hasLeftChild) {
			nn.left = createTree(nn, true);
		}
		
		System.out.println(nn.data+" :has Right Child ?");
		boolean hasRightChild = sc.nextBoolean();
		if(hasRightChild) {
			nn.right= createTree(nn, false);
		}
		return nn;
	}
	public void printTree() {
		printTree(root);
	}
	private void printTree(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printTree(root.left);
		printTree(root.right);
		
	}
	public  int height() {
		return height(root);
	}
	private int height(Node root) {
		if(root == null) {
			return -1;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}
	public boolean isTreeBallenced() {
		return  isTreeBallenced(root);
	}
	private boolean isTreeBallenced(Node root) {
		if(root == null) {
			return true;
		}
		boolean ltb = isTreeBallenced(root.left);
		boolean rtb = isTreeBallenced(root.right);
		
		//for check if node self is ballence or not
		int lh    = height(root.left);
		int rh    = height(root.right);
		int bf    = lh-rh;
		if(bf == 0 || bf == -1 || bf == 1) {
			if(ltb && rtb) {
				return true;
			}
		}
		return false;
	}
	
	public  boolean ballencePairOptimize() {
		return ballencePairOptimize(root).isBallence;
	}
	private BallPair ballencePairOptimize(Node root) {
		if(root == null) {
			return new BallPair();
		}
		
		BallPair lbp = ballencePairOptimize(root.left);
		BallPair rbp = ballencePairOptimize(root.right);
		
		BallPair self= new BallPair();
		boolean isleftballence = lbp.isBallence;
		boolean isrightballence= rbp.isBallence;
		int bf         = lbp.height - rbp.height;
		if(isleftballence && isrightballence && bf >=-1 && bf <= 1) {
			self.isBallence = true;
		}else {
			self.isBallence = false;
		}
		self.height = Math.max(lbp.height,rbp.height)+1;
		return self;
		
	}
	public static void main(String[] args) {
		CheckTreeBallenced cb = new CheckTreeBallenced();
		cb.createTree();
		//cb.printTree();
		//System.out.println(cb.height());
		System.out.println("Tree is Ballenced "+cb.isTreeBallenced());
		System.out.println("Tree is Ballenced "+cb.ballencePairOptimize());
	}
}
