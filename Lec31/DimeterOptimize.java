package Lec31;
import java.util.Scanner;
public class DimeterOptimize {
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public DimeterOptimize() {
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
	public class DiaPair{
		int dia;
		int hei;
	}
	public int getDiameter3() {
		return getDiameter3(root).dia;
	}
	public DiaPair getDiameter3(Node root) {

		//basecase
		if(root == null) {
			DiaPair baseresult = new DiaPair();
			baseresult .dia =0;
			baseresult.hei  =-1;
			return baseresult;
		}
		DiaPair leftdiapair = getDiameter3(root.left);
		DiaPair rightdiapair= getDiameter3(root.right);
		
		DiaPair self        = new DiaPair();
		int leftdiameter    = leftdiapair.dia;
		int rightdiameter   = rightdiapair.dia;
		int selfdiameter    = leftdiapair.hei + rightdiapair.hei + 2;
		self.dia            = Math.max(selfdiameter, Math.max(rightdiameter, leftdiameter));
		self.hei            = Math.max(leftdiapair.hei, rightdiapair.hei)+1;
		return self;
	}
	
	public static void main(String[] args) {
		DimeterOptimize dop = new DimeterOptimize();
		System.out.println(dop.getDiameter3());
	}
}
