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
    public List<Integer> inorderTraversal(TreeNode root) {
        
		List<Integer> tempList = new ArrayList<Integer>();
		
		if(root != null) {
			tempList.addAll(inorderTraversal(root.left));
			tempList.add(root.val);
			tempList.addAll(inorderTraversal(root.right));
		}
		
		return tempList;
    }
}