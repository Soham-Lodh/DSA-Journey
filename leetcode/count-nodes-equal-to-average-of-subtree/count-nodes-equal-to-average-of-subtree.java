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
    int avg=0;
    public int averageOfSubtree(TreeNode root) {
        average(root);
        return avg;
    }
    ArrayList<Integer> average(TreeNode root){
        if(root==null)return null;
        int val=root.val;
        int c=1;
        ArrayList<Integer> left=average(root.left);
        ArrayList<Integer> right=average(root.right);
        if(left!=null){
            val+=left.get(0);
            c+=left.get(1);
        }
        if(right!=null){
            val+=right.get(0);
            c+=right.get(1);
        }
        if((val/c)==root.val)avg++;
        ArrayList<Integer> rooter=new ArrayList<>();
        rooter.add(val);
        rooter.add(c);
        return rooter;
    }
}