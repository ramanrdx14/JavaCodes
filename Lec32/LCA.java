package Lec32;
class TreeNode {
	      int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
public class LCA {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==  null)return null;
        if(root == p || root == q){
            return root;
        }
        TreeNode leftans  = lowestCommonAncestor(root.left,p,q);
        TreeNode rightans = lowestCommonAncestor(root.right,p,q);
        if(leftans != null && rightans != null){
            return root;
        }else if(leftans == null ){
            return rightans;
        }else{
            return leftans;
        }   
    }
	
	public static void main(String[] args) {
		

	}

}
