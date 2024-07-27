package Lec32;

public class PathSum3 {
	  class TreeNode {
	    int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	}

	  public int sumNumbers(TreeNode root) {
	        return sumNumbers(root,0);
	    }
	    public int sumNumbers(TreeNode root,int no) {
	        if(root == null){
	            return 0;
	        }
	        if(root.left == null && root.right==null){
	            return no*10+root.val;
	        }
	        int lpath = sumNumbers(root.left,no*10+root.val);
	        int rpath = sumNumbers(root.right,no*10+root.val);
	        return lpath+rpath ;
	    }
	public static void main(String[] args) {
		

	}

}
