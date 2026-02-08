class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode curr = list.get(i);
            curr.left = null;
            curr.right = list.get(i + 1);
        }

        TreeNode last = list.get(list.size() - 1);
        last.left = null;
        last.right = null;
    }

    void preorder(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
