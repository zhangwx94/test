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
        List<Integer> ret = new ArrayList<>();
        TreeNode pre = null;
        TreeNode cur = root;
        while(cur!=null){
            if(cur.left==null){
                ret.add(cur.val);
                cur=cur.right;
            }
            else{
                pre=cur.left;
                while(pre.right!=null&&pre.right!=cur){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=cur;
                    cur=cur.left;
                }
                else{
                    pre.right=null;
                    ret.add(cur.val);
                    cur=cur.right;
                }
            }
        }
        return ret;
    }
}
