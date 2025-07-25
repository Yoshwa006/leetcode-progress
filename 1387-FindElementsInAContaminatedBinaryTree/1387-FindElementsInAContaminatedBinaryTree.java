// Last updated: 7/25/2025, 8:51:48 AM
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
class FindElements {

    HashSet<Integer> set;
    Queue<TreeNode> qu;
    public FindElements(TreeNode root) {

        set = new HashSet<>();
        qu = new LinkedList<>();
        root.val = 0;

        qu.add(root);
        set.add(root.val);

        while(!qu.isEmpty()){
            TreeNode node = qu.poll();
            if(node.left != null){
                node.left.val =  2 * node.val + 1;
                qu.add(node.left);
                set.add(node.left.val);
            }
            if(node.right != null){
                node.right.val = 2 * node.val +2;
                qu.add(node.right);
                set.add(node.right.val);
            }
        }
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */