package Lec32;
import java.util.Scanner;
public class SumOfNodes {
	class Node{
		Node left;
		Node right;
		int data;
	}
	public Node root;
	Scanner sc = new Scanner(System.in);
	public void createTree() {
		root = createTree(null, false);
	}
	private Node createTree(Node root,boolean hlc) {
		if(root == null) {
			System.out.println("Enter Roots Data :");
		}else {
			if(hlc) {
				System.out.println(" Enter left child Data  of:"+root.data);
			}else {
				System.out.println("Enter right child Data of :"+root.data);
			}
		}
		Node newnode = new Node();
		int n        = sc.nextInt();
		newnode.data = n;
		
		
		System.out.println(newnode.data+" Has Left Child ?");
		boolean hasleftchild = sc.nextBoolean();
		if(hasleftchild) {
			newnode.left = createTree(newnode, true);
		}
		System.out.println(newnode.data+" Has Right Child ?");
		boolean hasrightchild = sc.nextBoolean();
		if(hasrightchild){
			newnode.right = createTree(newnode, false);
		}
		return newnode;
	}
	public int sumOfAllNodes() {
		return sumOfAllNodes(root);
	}
	public int sumOfAllNodes(Node node) {
		if(node == null) {
			return 0;
		}
		int lss = sumOfAllNodes(node.left);
		int rss = sumOfAllNodes(node.right);
		return lss+rss+node.data; //self + leftsubtree sum + right subtree sum
	}
	public static void main(String[] args) {
		SumOfNodes son = new SumOfNodes();
		son.createTree();
		System.out.println(son.sumOfAllNodes());

	}

}
