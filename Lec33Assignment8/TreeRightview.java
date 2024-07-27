package Lec33Assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lec33Assignment8.PrintLeafNodes.Node;

public class TreeRightview {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		TreeRightview m = new TreeRightview();
		BinaryTree bt = m.new BinaryTree();
		bt.rightView();
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
			this.root = this.takeInput();
		}

		public Node takeInput() {
			//Level order input
			Scanner sc = new Scanner(System.in);
			Queue<Node> q = new LinkedList<>();
			if(root == null) {
				Node node = new Node();
				node.data = sc.nextInt();
				root = node;
				q.add(node);
			}
			while(!q.isEmpty()) {
				Node element = q.poll();
				int leftdata = sc.nextInt();
				if(leftdata != -1) {
					Node left = new Node();
					left.data = leftdata;
					element.left = left;
					q.add(left);
				}
				int rightdata = sc.nextInt();
				if(rightdata != -1) {
					Node right = new Node();
					right.data = rightdata;
					element.right = right;
					q.add(right);
				}
			}
			return root;
		}
		public void rightView() {
			rightView(this.root,0);
		}
		int maxdepth = -1;
		public void rightView(Node root,int currentheight) {
			if(root == null)return;
			if(currentheight > maxdepth) {
				System.out.print(root.data+" ");
				maxdepth++;
			}
			rightView(root.right,currentheight+1);
			rightView(root.left,currentheight+1);
		}
	}

}