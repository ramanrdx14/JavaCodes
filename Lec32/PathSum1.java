package Lec32;

public class PathSum1 {
	class TreeNode {
	    int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	}
	public boolean hasPathSum1(TreeNode root, int targetSum) {
        if(root == null){
         return false;
        }
        if(root.left==null && root.right==null && targetSum-root.val == 0){
            return true;
        }
        boolean ans1 = hasPathSum1(root.left,targetSum-root.val);
        boolean ans2 = hasPathSum1(root.right,targetSum-root.val);
        return ans1||ans2;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)return false;
        else return hasPathSum1(root,targetSum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
