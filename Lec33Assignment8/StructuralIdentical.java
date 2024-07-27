package Lec33Assignment8;
import java.util.*;
public class StructuralIdentical {
	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root;
	public void createTree() {
		this.root = createTree(root,false);
	}
	Scanner sc = new Scanner(System.in);
	public Node createTree(Node node,boolean hlc) {
		if(node == null) {
			System.out.println("Enter Root Data :");
		}else {
			if(hlc) {
				System.out.println("Enter "+node.data+" left child :");
			}else {
				System.out.println("Enter "+node.data+" right child :");
			}
		}
		Node nn = new Node();
		nn.data = sc.nextInt();
		
		System.out.println(nn.data+" has left child ?");
		boolean hlca = sc.nextBoolean();
		if(hlca) {
			nn.left = createTree(nn, hlca);
		}
		
		System.out.println(nn.data+" has right child ?");
		boolean hrca = sc.nextBoolean();
		if(hrca) {
			nn.right = createTree(nn, hrca);
		}
		
		return nn;
	}
	public void display() {
		display(root);
	}
	public void display(Node root) {
		if(root == null)return;
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}
	public static void main(String[] args) {
		StructuralIdentical s = new StructuralIdentical();
		s.createTree();
		s.display();
		System.out.println("---------------------------------");
		StructuralIdentical t = new StructuralIdentical();
		s.createTree();
		s.display();
	}

}
