// Last updated: 7/25/2025, 8:54:29 AM
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
        List<Integer> list = new ArrayList<>();
        run(root,list);
        return list;
    }

    void run(TreeNode root, List<Integer> nums){
if (root == null) return;
  run(root.left, nums);
  nums.add(root.val);
  run(root.right, nums);
    }
}