import java.util.*;
class Binary_Tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node buildTreePreorder(int arr[], int idx[]) {
            if (idx[0] >= arr.length) {
                return null;
            }
            if (arr[idx[0]] == -1) {
                idx[0]++;
                return null;
            }
            Node root = new Node(arr[idx[0]++]);
            root.left = buildTreePreorder(arr, idx);
            root.right = buildTreePreorder(arr, idx);
            return root;
        }
        void preorder(Node root,ArrayList<Integer> list){
            if(root==null)return;
            list.add(root.data);
            preorder(root.left,list);
            preorder(root.right,list);
        }
        void inorder(Node root,ArrayList<Integer> list){
            if(root==null)return;
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
        }
        void postorder(Node root,ArrayList<Integer> list){
            if(root==null)return;
            postorder(root.left,list);
            postorder(root.right,list);
            list.add(root.data);
        }
        void levelorder(Node root,ArrayList<Integer> list){
            if(root==null)return;
            Queue<Node> queue=new ArrayDeque<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                Node temp=queue.poll();
                list.add(temp.data);
                if(temp.left!=null)queue.offer(temp.left);
                if(temp.right!=null)queue.offer(temp.right);
            }
        }
        int height(Node root){
            if(root==null)return 0;
            int h=1+Math.max(height(root.left),height(root.right));
            return h;
        }
        int countNodes(Node root){
            if(root==null)return 0;
            return 1+countNodes(root.left)+countNodes(root.right);
        }
        int nodeSum(Node root){
            if(root==null)return 0;
            return root.data+nodeSum(root.left)+nodeSum(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] idx = {0};
        Node root = tree.buildTreePreorder(arr, idx);
        ArrayList<Integer> preorder=new ArrayList<>();
        tree.preorder(root,preorder);
        System.out.println("Preorder: "+preorder);
        ArrayList<Integer> inorder=new ArrayList<>();
        tree.inorder(root,inorder);
        System.out.println("Inorder: "+inorder);
        ArrayList<Integer> postorder=new ArrayList<>();
        tree.postorder(root,postorder);
        System.out.println("Postorder: "+postorder);
        ArrayList<Integer> levelorder=new ArrayList<>();
        tree.levelorder(root,levelorder);
        System.out.println("Levelorder: "+levelorder);
        System.out.println("Height in terms of nodes: "+tree.height(root));
        System.out.println("Height in terms of edges: "+(tree.height(root)-1));
        System.out.println("Total number of nodes: "+tree.countNodes(root));
        System.out.println("Sum of all nodes: "+tree.nodeSum(root));
    }
}
