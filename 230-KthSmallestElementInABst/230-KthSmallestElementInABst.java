// Last updated: 7/25/2025, 8:53:43 AM
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
    int count =0;
    int res ;

    public int kthSmallest(TreeNode root, int k) {
        run(root,k);
        return res;
    }

    void run(TreeNode node, int k){
        if(node == null){
            return;
        }
        run(node.left, k);
        count++;
        if(count == k){
            res = node.val;
            return;
        }
        run(node.right , k);
    }
}