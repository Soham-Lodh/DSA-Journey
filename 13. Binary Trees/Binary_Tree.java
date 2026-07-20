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
        int diameter(Node root){
            if(root==null)return 0;
            int d1=1+height(root.left)+height(root.right);
            int d2=diameter(root.left);
            int d3=diameter(root.right);
            return Math.max(d1,Math.max(d2,d3));
        }
        static class info{
            int diam;
            int height;
            info(int diam,int height){
                this.diam=diam;
                this.height=height;
            }
        }
        info diameter_optimized(Node root){
            if(root==null){
                return new info(0,0);
            }
            info left=diameter_optimized(root.left);
            info right=diameter_optimized(root.right);
            int self_d=left.height+right.height+1;
            int diam=Math.max(Math.max(left.diam,right.diam),self_d);
            int self_h=Math.max(left.height,right.height)+1;
            return new info(diam,self_h);
        }
        boolean match(Node root,Node subroot){
            if(root==null)return false;
            if(root.data==subroot.data){
                if(isIdentical(root,subroot))return true;
                else return match(root.left,subroot)||match(root.right,subroot);
            }
            return match(root.left,subroot)||match(root.right,subroot);
            
        }
        boolean isIdentical(Node root,Node subroot){
            if(root==null && subroot==null)return true;
            else if((root==null && subroot!=null) || (root!=null && subroot==null) || (root.data!=subroot.data))return false;
            else return isIdentical(root.left,subroot.left) && isIdentical(root.right,subroot.right);
        }
        static class dist{
            Node root;
            int d;
            dist(int d,Node root){
                this.root=root;
                this.d=d;
            }
        }
        ArrayList<Integer> topview(Node root){
            if(root==null)return new ArrayList<Integer>();
            Queue<dist>queue=new ArrayDeque<>();
            dist temp=new dist(0,root);
            queue.offer(temp);
            HashMap<Integer,Node> hs=new HashMap<>();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            while(!queue.isEmpty()){
                dist t=queue.poll();
                if(!hs.containsKey(t.d)){
                    hs.put(t.d,t.root);
                    min=Math.min(min,t.d);
                    max=Math.max(t.d,max);
                }
                if(t.root.left!=null)queue.offer(new dist(t.d-1,t.root.left));
                if(t.root.right!=null)queue.offer(new dist(t.d+1,t.root.right));
            }
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=min;i<=max;i++){
                list.add(hs.get(i).data);
            }
            return list;
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
        System.out.println("Diameter: "+tree.diameter_optimized(root).diam);
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.println("Is subtree present: "+tree.match(root,subroot));
        System.out.println("Top view: "+tree.topview(root));
    }
}
