// Last updated: 7/25/2025, 8:54:25 AM
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
    public List<List<Integer>> levelOrder(TreeNode head) {
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();

            if(head == null) {
                return result;
            }

            q.add(head);

            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode current = q.poll();
                    level.add(current.val);

                    if (current.left != null) {
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                }

                result.add(level);
            }

            return result;
        }
    }