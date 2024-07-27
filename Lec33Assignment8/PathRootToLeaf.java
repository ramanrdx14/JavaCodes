package Lec33Assignment8;
import java.util.Arrays;
import java.util.Scanner;
public class PathRootToLeaf {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		PathRootToLeaf m = new PathRootToLeaf();
		m.createTree();
		//Scanner sc = new Scanner(System.in);
		int n = scn.nextInt();
		m.print(n);
		
		}
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public void createTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}
		public void print(int x) {
			print(this.root,x,"");
		}
		public void print(Node root,int x,String res) {
			if(root == null) return ;
			if(root.left == null && root.right == null) {
				if(x-root.data == 0) {
				    res+=root.data;
				    System.out.println(res);
				}
				return;
			}
			print(root.left,x-root.data,res+root.data+" ");
			print(root.right,x-root.data,res+root.data+" ");
		}
	}
