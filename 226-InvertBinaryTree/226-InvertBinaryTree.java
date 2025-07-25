// Last updated: 7/25/2025, 8:53:46 AM
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

    
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

    
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}