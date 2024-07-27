package Lec32;
import java.util.*;
public class PathSum2 {
	class TreeNode {
	    int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	}
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> list = new ArrayList<>();
	        pathSum(root,targetSum,list,new ArrayList());
	        return list;
	    }
	    public void pathSum(TreeNode root,int targetSum,List<List<Integer>> list,List<Integer> al){
	        if(root == null)return;
	        if(root.left == null && root.right==null){
	            if(targetSum - root.val == 0){
	                al.add(root.val);
	                list.add(new ArrayList(al));
	                al.remove(al.size()-1);
	            }
	            return;
	        }
	        al.add(root.val);
	        pathSum(root.left,targetSum-root.val,list,al);
	        pathSum(root.right,targetSum-root.val,list,al);
	        al.remove(al.size()-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
