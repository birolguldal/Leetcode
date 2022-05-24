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
    public int closestValue(TreeNode root, double target) {
        
       return closestValue(root, target, Double.MAX_VALUE, root.val);
        
    }
        
    private int closestValue(TreeNode root, double target, double diff, int currentClosest) {
            
            if(root == null) {   //base case
                return currentClosest;
            }
            
            if(Math.abs(target - root.val) < diff) {
                diff = Math.abs(target- root.val);
                currentClosest = root.val;
            }
            
            if(target > root.val) {
                return closestValue(root.right, target, diff, currentClosest);
            } else {
                return closestValue(root.left, target, diff, currentClosest);
            }
            
        }
        
        
}
