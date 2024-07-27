package Lec32;
public class PreInTreeConstruct {
	class TreeNode {
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
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode buildTree(int[]preorder,int plow,int phi,int[] inorder,int inlo,int inhi){
        if(plow>phi || inlo > inhi)return null;
        TreeNode node = new TreeNode(preorder[plow]);
        int idx = -1;
        int nei = 0;
        for(int i=inlo;i<=inhi;i++){
            if(inorder[i] == preorder[plow]){
                idx = i;
                break;
            }
            nei++;
        }
        node.left = buildTree(preorder,plow+1,plow+nei,inorder,inlo,idx-1);
        node.right= buildTree(preorder,plow+nei+1,phi,inorder,idx+1,inhi);
        return node;
    	}
    	public static void main(String[] args) {
		
    	}
	}
