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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> cols = new ArrayList();
        if(root == null)
        return cols;
        
        int[] range = new int[]{0,0};
        range(root,range,0);
        
        for(int i = range[0];i<=range[1];i++){
            cols.add(new ArrayList<Integer>());
        }
        
        Queue<TreeNode> queue = new LinkedList();
        Queue<Integer> colqueue = new LinkedList();
        
        queue.add(root);
        colqueue.add(-range[0]);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int col = colqueue.poll();
            
            cols.get(col).add(node.val);
            
            if(node.left!=null){
                queue.add(node.left);
                colqueue.add(col-1);
            }
            
            if(node.right!=null){
                queue.add(node.right);
                colqueue.add(col+1);
            }
        }
        
        return cols;
        
    }
    
    private void range(TreeNode root, int[] range, int col){
        if(root==null){
            return;
        }
        
        range[0]=Math.min(range[0],col);
        range[1]=Math.max(range[1],col);
        
        range(root.left, range, col-1);
        range(root.right, range, col+1);
    }
}
