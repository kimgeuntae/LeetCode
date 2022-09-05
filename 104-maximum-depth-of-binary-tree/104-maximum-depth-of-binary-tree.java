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
    public int maxDepth(TreeNode root) {
        int dep, depL, depR;
        
        if(root == null) {
        	dep = 0;
        } else {
        	depL = maxDepth(root.left);
        	depR = maxDepth(root.right);
        	if(depL >= depR) dep = depL+1;
        	else dep = depR+1;
        }
        
        return dep;
    }
}