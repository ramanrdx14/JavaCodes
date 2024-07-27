package Lec33Assignment8;
import java.util.Scanner;
public class ReplaceSumWithGreaterNodes {

	class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] sufixsum  = new int[n];
		sufixsum[n-1]   = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			sufixsum[i] = arr[i]+sufixsum[i+1];
		}
		ReplaceSumWithGreaterNodes rn = new ReplaceSumWithGreaterNodes();
		rn.root = rn.createBinarySearchTree(sufixsum, 0, n-1);
		rn.display();
	}
	public Node createBinarySearchTree(int[] arr,int lo,int hi) {
		if(lo > hi)return null;
		int mid = (lo+hi)/2;
		Node node  = new Node();
		node.data  = arr[mid];
		node.left  = createBinarySearchTree(arr, lo, mid-1);
		node.right = createBinarySearchTree(arr, mid+1, hi);
		return node;
	}
	public void display() {
		display(root);
	}
	private void display(Node root) {
		if(root == null)return;
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}

}
