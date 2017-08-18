/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //Stack<TreeNode> stack = new Stack<>();
        List<Integer> ret = new ArrayList<>();
        while (true) {
            while (root != null) {
            stack.push(root);
            root = root.left;
            }
            if (stack.isEmpty()) {
                break;  // no node left
            }
            TreeNode node = stack.pop();
            ret.add(node.val);
            root = node.right;
        }
        return ret;
    }
}
