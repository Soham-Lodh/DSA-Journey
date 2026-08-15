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
    void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    TreeNode balance(List<Integer>list,int l,int r){
        if(l>r)return null;
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=balance(list,l,mid-1);
        root.right=balance(list,mid+1,r);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        inorder(root,list);
        return balance(list,0,list.size()-1);
    }
}