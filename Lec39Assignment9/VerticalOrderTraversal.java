package Lec39Assignment9;
import java.util.*;
public class VerticalOrderTraversal {
	class Node{
		int data;
		Node left;
		Node right;
	}
	Node root = null;
	Scanner sc = new Scanner(System.in);
	int k      = sc.nextInt();
	public Node takeInput() {
		Queue<Node> q = new LinkedList<>();
		if(root == null)
		{
			int n = sc.nextInt();
			Node node = new Node();
			node.data = n;
			root = node;
			q.add(node);
		}
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				Node left = new Node();
				left.data = leftchild;
				temp.left = left;
				q.add(left);
			}
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				Node right = new Node();
				right.data = rightchild;
				temp.right = right;
				q.add(right);
			}
		}
		return root;
	}
	 public void verticalTraversal() {
	        TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
	        helper(this.root,tm,0);
	        
	        for(int i:tm.keySet()){
	          ArrayList<Integer>  al = tm.get(i);
	          for(int j:al)System.out.print(j+" ");
	        }
	        
	    }
	public static void main(String[] args) {
		VerticalOrderTraversal vt = new VerticalOrderTraversal();
		vt.takeInput();
		vt.verticalTraversal();
	}
	public void helper(Node root,TreeMap<Integer,ArrayList<Integer>> tm,int hd){
        if(root == null)return;
        if(tm.containsKey(hd)){
            ArrayList<Integer> al = tm.get(hd);
            al.add(root.data);
            tm.put(hd,al);
        }else{
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            tm.put(hd,al);
        }
        helper(root.left,tm,hd-1);
        helper(root.right,tm,hd+1);
    }
}
