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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return symmetric(root.left,root.right);
    }
    boolean symmetric(TreeNode l1,TreeNode l2){
        if(l1==null && l2==null)return true;
        else if(l1==null && l2!=null)return false;
        else if(l1!=null && l2==null)return false;
        else if(l1.val!=l2.val)return false;
        else return symmetric(l1.left,l2.right) & symmetric(l1.right,l2.left);
    }
}