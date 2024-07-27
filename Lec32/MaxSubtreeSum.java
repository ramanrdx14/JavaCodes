package Lec32;
import java.util.Scanner;
public class MaxSubtreeSum {
	class Node{
		Node left;
		Node right;
		int data;
	}
public class MaxSubtreePair{
	int maxsubsum=Integer.MIN_VALUE;
	int entiresum=Integer.MIN_VALUE;
    }
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
	
	/************************************************************************************/
	public int maxsubtreeSum2() {
		return maxsubtreeSum2(root);
	}
	public int maxsubtreeSum2(Node node) {
		if(node == null) {
			return 0;
		}
		int leftMaxSubtreeSum  = maxsubtreeSum2(node.left);
		int rightMaxSubtreeSum = maxsubtreeSum2(node.right);
		int selfsum            = node.data + subtreesum(node.left)+subtreesum(node.right);
		return Math.max(selfsum,Math.max(leftMaxSubtreeSum, rightMaxSubtreeSum));
	}
	public int subtreesum(Node node) {
		if(node == null) {
			return 0;
		}
		return subtreesum(node.left)+subtreesum(node.right)+node.data;
	}
	
	/************************************************************************************/
	
	/***********************************************************************************/
	
	public  int maxsubtreeSum1() {
		return maxsubtreeSum1(root);
	}
	static int maxi = Integer.MAX_VALUE;
	public  int  maxsubtreeSum1(Node node) {
		if(node == null)return Integer.MIN_VALUE;
		int lss = maxsubtreeSum1(node.left);
		int rss = maxsubtreeSum1(node.right);
		if(node.data+lss+rss > maxi) {
			maxi = node.data+lss+rss;
		}
		return maxi;
	}
	
	/************************************************************************************/
	
	public int getMaxSubtreeSum() {
		return getMaxSubtreeSum(root).maxsubsum;
	}
	public MaxSubtreePair getMaxSubtreeSum(Node node) {
		if(node == null)return new MaxSubtreePair();
		MaxSubtreePair lp = getMaxSubtreeSum(node.left);
		MaxSubtreePair rp = getMaxSubtreeSum(node.right);
		MaxSubtreePair self = new MaxSubtreePair();
		self.entiresum      =   lp.entiresum + rp.entiresum + node.data;
		self.maxsubsum      =   Math.max(lp.maxsubsum, Math.max(rp.maxsubsum,self.entiresum));
		return self;
	}
	public static void main(String[] args) {
		MaxSubtreeSum ms = new MaxSubtreeSum();
		ms.createTree();
		System.out.println(ms.maxsubtreeSum2());
		System.out.println(ms.maxsubtreeSum1());
		System.out.println(ms.getMaxSubtreeSum());
		
	}

}
