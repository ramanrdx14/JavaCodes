package Lec33Assignment8;

import java.util.*;
public class SiblingOfBinaryTree {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		SiblingOfBinaryTree m = new SiblingOfBinaryTree();
		BinaryTree bt = m.new BinaryTree();
		bt.sibling();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
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

		public void sibling() {
			this.sibling(this.root);
		}

		private void sibling(Node root) {
			if(root == null)return;

			//Kisi bhi parent node ka agar single child hai to wo child sibling ni hai 
			if(root.left == null && root.right == null)return;
			if(root.left == null && root.right != null){
				System.out.print(root.right.data+" ");
			}
			if(root.left != null && root.right == null){
				System.out.print(root.left.data+" ");
			}
			sibling(root.left);
			sibling(root.right);
		}

	}

}
