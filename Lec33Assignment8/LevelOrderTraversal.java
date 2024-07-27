package Lec33Assignment8;
import java.util.*;
public class LevelOrderTraversal {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LevelOrderTraversal m = new LevelOrderTraversal();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()){
				int n    = q.size();
				while(n-->0) {
					Node ele = q.poll();
					System.out.print(ele.data+" ");
					if(ele.left != null){
						q.add(ele.left);
					}
					if(ele.right != null){
						q.add(ele.right);
					}
				}
				System.out.println();
			}
		}

	}
}
