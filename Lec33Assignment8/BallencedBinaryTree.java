package Lec33Assignment8;
import java.util.*;
public class BallencedBinaryTree {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		BallencedBinaryTree m = new BallencedBinaryTree();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
			 if(node == null){
				 BalancedPair baseans = new BalancedPair();
				 baseans.height = -1;
				 baseans.isBalanced = true;
				 return baseans;
			 }
			 BalancedPair leftans = isBalanced(node.left);
			 BalancedPair rightans= isBalanced(node.right);
			 BalancedPair myans   = new BalancedPair();
			 int bf               = leftans.height - rightans.height;
			 if(bf >=-1 && bf<= 1 && leftans.isBalanced && rightans.isBalanced){
				 myans.isBalanced = true;
			 }else{
				  myans.isBalanced = false;
			 }
			 myans.height = Math.max(leftans.height,rightans.height)+1;
			 return myans;

		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}
}