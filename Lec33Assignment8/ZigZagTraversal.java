package Lec33Assignment8;

import java.util.*;
public class ZigZagTraversal {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ZigZagTraversal m = new ZigZagTraversal();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
		Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(this.root);
        int eoc = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> al = new ArrayList<>();
            while(n-->0){
                Node node = q.poll();
                al.add(node.data);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if(eoc%2!=0){
                Collections.reverse(al);
            }
            ans.add(al);
            eoc++;
        	}
			for(List<Integer> l1:ans){
				for(int i:l1){
					System.out.print(i+" ");
				}
			}
			
		}

	}

}
