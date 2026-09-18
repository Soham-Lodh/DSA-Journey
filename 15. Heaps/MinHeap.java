import java.util.*;
public class MinHeap {
    static class heap{
        ArrayList<Integer> arr;
        heap(){
            arr = new ArrayList<>();
        }
        void insert(int val){
            arr.add(val);
            int c=arr.size()-1;
            int p=(c-1)/2;
            while(arr.get(p)>arr.get(c)){
                int temp=arr.get(p);
                arr.set(p,arr.get(c));
                arr.set(c,temp);
                c=p;
                p=(c-1)/2;
            }
        }
        int peek(){return arr.get(0);}
        void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int min=i;
            if(left<arr.size() && arr.get(left)<arr.get(min))min=left;
            if(right<arr.size() && arr.get(right)<arr.get(min))min=right;
            if(min!=i){
                int temp=arr.get(min);
                arr.set(min,arr.get(i));
                arr.set(i,temp);
                heapify(min);
            }
        }
        int delete(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[]args){
        heap h=new heap();
        h.insert(12);
        h.insert(25);
        h.insert(1);
        h.insert(2);
        while(!h.isEmpty()){
            System.out.println(h.delete());
        }
    }
}
