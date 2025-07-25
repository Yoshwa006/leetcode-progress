// Last updated: 7/25/2025, 8:54:09 AM
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
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
       Pre(root);
       return list;
    }

    public TreeNode Pre(TreeNode root){
        if(root == null){
        return null;
       }

       list.add(root.val);
        preorderTraversal(root.left);
        
        preorderTraversal(root.right);

        return root;
    }
}