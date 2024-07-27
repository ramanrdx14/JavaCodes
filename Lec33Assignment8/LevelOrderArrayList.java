package Lec33Assignment8;
import java.util.*;
public class LevelOrderArrayList {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LevelOrderArrayList m = new LevelOrderArrayList();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
       
        while(!q.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
            int n = q.size();
            while(n-->0){
            Node temp = q.poll();
            ans.add(temp.data);
            if(temp != null && temp.left!=null){
                q.add(temp.left);
            }
            if(temp!=null && temp.right!=null){
                q.add(temp.right);
              }
            }
            al.add(ans);
        }
        return al;
		
		}

	}
	
}
