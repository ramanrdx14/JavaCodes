package Lec33;

import Lec33.ValidateBST.TreeNode;

public class ValidBSTOptimize {

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
	class Pair{
		long Max = Long.MIN_VALUE;
		long Min = Long.MAX_VALUE;
		boolean isValid = true;
	}
    public boolean isValidBST(TreeNode root) {
        return isBST(root).isValid;
    }
    public Pair isBST(TreeNode root){
        if(root == null)return new Pair();

        Pair isleftbst = isBST(root.left);
        Pair isrightbst= isBST(root.right);

        //self ans 
        Pair self = new Pair();
        self.Max = Math.max(isleftbst.Max,Math.max(isrightbst.Max,root.val));
        self.Min = Math.min(isleftbst.Min,Math.min(isrightbst.Min,root.val));
        if(isleftbst.isValid&&isrightbst.isValid&&root.val>isleftbst.Max&&root.val<isrightbst.Min)
        {
            self.isValid = true;  // sb condition true hoga matlb tree valid bst hai 
        }else{
            self.isValid = false; // ni to tree valid bst ni h
        }
        return self;
    }
	public static void main(String[] args) {
		

	}

}
