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
    public static boolean isSymmetric(TreeNode root) {
		return isSymmetric(root.left, root.right);
    }
	
	private static boolean isSymmetric(TreeNode l1, TreeNode r1) {
		if(l1 == null || r1 == null) return (l1 == r1);
		
		if(l1.val == r1.val) {
			if(!isSymmetric(l1.left, r1.right)) return false;
			if(!isSymmetric(l1.right, r1.left)) return false;
		} else return false;
		
		return true;
	}
}