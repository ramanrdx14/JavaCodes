package Lec32;
import java.util.*;
public class RightViewOfBinaryTree {
	class TreeNode {
	    int val;
	   TreeNode left;
	   TreeNode right;
	   TreeNode(int x) { val = x; }
	}
	int depth=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightSideView(root,list,0);
        return list;
    }
    public void rightSideView(TreeNode root,List<Integer> list,int current){
        if(root == null)return;
        if(current > depth){
            list.add(root.val);
            depth++;
        }
        rightSideView(root.right,list,current+1);
        rightSideView(root.left,list,current+1);
    }
	public static void main(String[] args) {
		
	}
}
