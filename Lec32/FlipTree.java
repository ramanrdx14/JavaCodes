package Lec32;
import java.util.Scanner;
class Node{
	Node left;
	Node right;
	int data;
}
public class FlipTree {
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
	public boolean flipEquiv(Node n1,Node n2) {
		return flipEquiv1(n1, n2);
	}
	public boolean flipEquiv1(Node root1, Node root2) {
        if(root1 == null && root2==null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }

        boolean ans1 = flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
        boolean ans2 = flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right);
        return ans1 || ans2;
    }
	public static void main(String[] args) {
		FlipTree f1= new FlipTree();
		FlipTree f2= new FlipTree();
		
		f1.createTree();
		f2.createTree();
		System.out.println(f1.flipEquiv(f1.root, f2.root));
		f1.display();
	}
}

//INPUT
/*   1 true 2 true 4 false false true 5 true 7 false false true 8 false
     false true 3 true 6 false false false
*/