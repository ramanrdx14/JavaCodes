package Lec33;

public class ValidateBST {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	class Solution {
	    public boolean isValidBST(TreeNode root) {
	        return isBST(root);
	    }
	    long min(TreeNode root){
	        if(root == null)return Long.MAX_VALUE;
	        long lm = min(root.left);
	        long rm = min(root.right);
	        return Math.min(lm,Math.min(root.val,rm));
	    }
	    long max(TreeNode root){
	        if(root == null)return Long.MIN_VALUE;
	        long lm = max(root.left);
	        long rm = max(root.right);
	        return Math.max(lm,Math.max(root.val,rm));
	    }
	    boolean isBST(TreeNode root)
	    {
	        if(root == null)return true;
	        //if(root.left == null && root.right==null)return true;
	        if(root.val <= max(root.left) || root.val >=min(root.right)){
	            return false;
	        }
	        boolean ans1 = isBST(root.left);
	        boolean ans2 = isBST(root.right);
	        return ans1&&ans2;
	    }
	}
	public static void main(String[] args) {
		

	}

}
