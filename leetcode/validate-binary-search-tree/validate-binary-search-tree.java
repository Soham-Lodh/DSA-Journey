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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        List<Integer> lst=inorderTraversal(root);
        for(int i=1;i<lst.size();i++){
            if(lst.get(i-1)>=lst.get(i))return false;
        }
        return true;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        inorder(root,lst);
        return lst;
    }
    void inorder(TreeNode root,List<Integer> lst){
        if(root==null)return ;
        inorder(root.left,lst);
        lst.add(root.val);
        inorder(root.right,lst);
    }
}