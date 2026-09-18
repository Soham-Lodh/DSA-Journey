
import java.util.*;

public class bst {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }

        Node() {

            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree {

        Node createTree(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            } else if (root.val > value) {
                root.left = createTree(root.left, value);
            } else if (root.val < value) {
                root.right = createTree(root.right, value);
            }
            return root;
        }

        void inorder(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }

        void preorder(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            list.add(root.val);
            preorder(root.left, list);
            preorder(root.right, list);
        }

        void postorder(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.val);
        }

        Node search(Node root, int key) {
            if (root == null) {
                return null;
            } else if (root.val == key) {
                return root;
            } else if (root.val > key) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }
        }

        Node delete(Node root, int key) {
            if (root == null) {
                return null;
            } else if (root.val < key) {
                root.right = delete(root.right, key);
            } else if (root.val > key) {
                root.left = delete(root.left, key);
            } else {
                if (root.left == null && root.right == null) {
                    return null;
                } else if (root.left == null || root.right == null) {
                    return root.left == null ? root.right : root.left;
                } else {
                    Node temp = root.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    root.val = temp.val;
                    root.right = delete(root.right, temp.val);
                }
            }
            return root;
        }

        int paths(Node root, List<Integer> list) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                list.add(root.val);
                printPath(list);
                list.remove(list.size() - 1);
                return 1;
            } else {
                list.add(root.val);
                int a1 = paths(root.left, list);
                int a2 = paths(root.right, list);
                list.remove(list.size() - 1);
                return a1 + a2;
            }
        }

        void printPath(List<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + "->");
            }
            System.out.println("Null");
        }

        void printRange(Node root, int k1, int k2, List<Integer> list) {
            if (root == null) {
                return;
            } else if (root.val < k1) {
                printRange(root.right, k1, k2, list);
            } else if (root.val > k2) {
                printRange(root.left, k1, k2, list);
            } else if (root.val >= k1 && root.val <= k2) {
                printRange(root.left, k1, k2, list);
                list.add(root.val);
                printRange(root.right, k1, k2, list);
            }
        }

        boolean validateBST(Node root, long min, long max) {
            if (root == null) {
                return true;
            }
            if (root.val <= min || root.val >= max) {
                return false;
            }
            return validateBST(root.left, min, root.val)
                    && validateBST(root.right, root.val, max);
        }

        Node mirrorBST(Node root) {
            if (root == null) {
                return null;
            }
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            root.left = mirrorBST(root.left);
            root.right = mirrorBST(root.right);
            return root;
        }

        Node SortArray_BST(int arr[], int l, int r) {
            if (l > r) {
                return null;
            }
            int mid = l + (r - l) / 2;
            Node root = new Node(arr[mid]);
            root.left = SortArray_BST(arr, l, mid - 1);
            root.right = SortArray_BST(arr, mid + 1, r);
            return root;
        }

        Node BST_Balanced(Node root) {
            List<Integer> list = new ArrayList<>();
            inorder(root, list);
            root = SortList_BST(list, 0, list.size() - 1);
            return root;
        }

        Node SortList_BST(List<Integer> list, int l, int r) {
            if (l > r) {
                return null;
            }
            int mid = l + (r - l) / 2;
            Node root = new Node(list.get(mid));
            root.left = SortList_BST(list, l, mid - 1);
            root.right = SortList_BST(list, mid + 1, r);
            return root;
        }

        int BST_BT_Exp(Node root) {
            if (validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                return height(root);
            } else {
                return Math.max(BST_BT_Exp(root.left), BST_BT_Exp(root.right));
            }
        }

        int height(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }
        int maxSize = 0;

        class info {

            boolean isBst;
            int size;
            int min;
            int max;

            info(boolean isBst, int size, int min, int max) {
                this.isBst = isBst;
                this.size = size;
                this.min = min;
                this.max = max;
            }
        }

        info BST_BT(Node root) {
            if (root == null) {
                info i = new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
                return i;
            }
            info l = BST_BT(root.left);
            info r = BST_BT(root.right);
            info k = new info(false, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            if (l.isBst && r.isBst) {
                if (l.max < root.val && r.min > root.val) {
                    k.isBst = true;
                }
            }
            k.size = l.size + r.size + 1;
            if (k.isBst) {
                maxSize = Math.max(maxSize, k.size);
            }
            k.min = Math.min(l.min, Math.min(r.min, root.val));
            k.max = Math.max(l.max, Math.max(r.max, root.val));
            return k;
        }

        Node Merge2BST(Node n1, Node n2) {
            if (n1 == null) {
                return n2; 
            }else if (n2 == null) {
                return n1;
            }
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            inorder(n1, l1);
            inorder(n2, l2);
            List<Integer> l = merge2list(l1, l2);
            return SortList_BST(l, 0, l.size() - 1);
        }

        List<Integer> merge2list(List<Integer> l1, List<Integer> l2) {
            List<Integer> l = new ArrayList<>();
            int i = 0, j = 0;
            while (i < l1.size() && j < l2.size()) {
                if (l1.get(i) < l2.get(j)) {
                    l.add(l1.get(i++));
                } else {
                    l.add(l2.get(j++));
                }
            }
            while (i < l1.size()) {
                l.add(l1.get(i++));
            }
            while (j < l2.size()) {
                l.add(l2.get(j++));
            }
            return l;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        int arr[] = {5, 4, 7, 1, 6, 3, 62, 61, 65, 86, 23, 13, 35};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = BST.createTree(root, arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        BST.inorder(root, list);
        System.out.println("Inorder: " + list);
        Node search = BST.search(root, 61);
        if (search != null) {
            System.out.println("Found: " + search.val);
        } else {
            System.out.println("Not Found");
        }
        root = BST.delete(root, 35);
        list.clear();
        BST.inorder(root, list);
        System.out.println("Inorder after deletion: " + list);
        root = BST.delete(root, 23);
        list.clear();
        BST.inorder(root, list);
        System.out.println("Inorder after deletion: " + list);
        root = BST.delete(root, 5);
        list.clear();
        BST.inorder(root, list);
        System.out.println("Inorder after deletion: " + list);
        list.clear();
        BST.printRange(root, 4, 61, list);
        System.out.println("Range: " + list);
        System.out.println("Total Paths: " + BST.paths(root, new ArrayList<>()));
        System.out.println("Is Valid BST: " + BST.validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        root = BST.mirrorBST(root);
        list.clear();
        BST.inorder(root, list);
        System.out.println("Inorder after mirroring: " + list);
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        Node root1 = BST.SortArray_BST(arr1, 0, arr1.length - 1);
        list.clear();
        BST.inorder(root1, list);
        System.out.println("Inorder of BST from sorted array: " + list);
        root1 = BST.BST_Balanced(root1);
        list.clear();
        BST.inorder(root1, list);
        System.out.println("Inorder of balanced BST: " + list);
        System.out.println("Height of balanced BST: " + BST.height(root1));
        Node root2 = new Node(10);
        root2.left = new Node(5);
        root2.right = new Node(15);
        root2.left.left = new Node(1);
        root2.right.right = new Node(7);
        System.out.println("Height of largest BST in binary tree: " + BST.BST_BT_Exp(root2));
        BST.BST_BT(root2);
        System.out.println("Size of largest BST in binary tree: " + BST.maxSize);
        Node root3 = BST.Merge2BST(root1, root2);
        list.clear();
        BST.inorder(root3, list);
        System.out.println("Inorder of merged BST: " + list);
        System.out.println("Height of merged BST: " + BST.height(root3));

    }
}
