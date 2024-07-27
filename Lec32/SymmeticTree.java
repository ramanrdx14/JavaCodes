package Lec32;
import java.util.Scanner;
public class SymmeticTree{
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
	public void display() {
		display(root);
	}
	public void display(Node node) {
		if(node == null)return;
		System.out.println(node.data);
		display(node.left);
		display(node.right);
	}
	public boolean isSymmetric() {
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(Node node1,Node node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2==null){
            return false;
        }
        if(node1.data != node2.data)return false;
        boolean ans1 = isSymmetric(node1.left,node2.right);
        boolean ans2 = isSymmetric(node1.right,node2.left);
        return ans1 && ans2;
    }
	public static void main(String[] args) {
		SymmeticTree st = new SymmeticTree();
		st.createTree();
		System.out.println(st.isSymmetric());
	}
}