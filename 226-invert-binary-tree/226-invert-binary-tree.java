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
    public TreeNode invertTree(TreeNode root) {
        
       if(root == null)
             return root;
 
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
 
        while(!qu.isEmpty()) {
           TreeNode temp = qu.poll();
 
            //Logic to Swap
            TreeNode tempNode = temp.left;
            temp.left = temp.right;
            temp.right = tempNode;
 
            if(temp.left != null)
              qu.add(temp.left);
 
            if(temp.right != null)
               qu.add(temp.right);
        }
 
        return root;
  }
}