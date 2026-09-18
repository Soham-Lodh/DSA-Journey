import java.util.*;
public class MaxHeap {
    static class heap{
        ArrayList<Integer> arr;
        heap(){
            arr = new ArrayList<>();
        }
        void insert(int val){
            arr.add(val);
            int c=arr.size()-1;
            int p=(c-1)/2;
            while(arr.get(p)<arr.get(c)){
                int temp=arr.get(p);
                arr.set(p,arr.get(c));
                arr.set(c,temp);
                c=p;
                p=(c-1)/2;
            }
        }
        int peek(){return arr.get(0);}
        boolean isEmpty(){
            return arr.size()==0;
        }
        void heapify(int i){
            int l=2*i+1;
            int r=2*i+2;
            int max=i;
            if(l<arr.size() && arr.get(l)>arr.get(max))max=l;
            if(r<arr.size() && arr.get(r)>arr.get(max))max=r;
            if(max!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(max));
                arr.set(max,temp);
                heapify(max);
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
    }
    public static void main(String[] args){
        heap h=new heap();
        h.insert(12);
        h.insert(2);
        h.insert(123);
        h.insert(3);
        while(!h.isEmpty())System.out.println(h.delete());
    }
}
