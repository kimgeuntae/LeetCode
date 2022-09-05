/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        int dep, depL, depR;
        
        if(root == null) {
        	return 0;
        } else {
	    	depL = minDepth(root.left);
	    	depR = minDepth(root.right);
	    	if(depL == 0 || depR == 0) dep = depL + depR + 1;
	    	else dep = Math.min(depL, depR) + 1;
        }
        
        return dep;
    }
}