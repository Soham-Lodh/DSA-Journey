import java.util.*;
public class WeakestSoldier {
    static class Soldiers implements Comparable<Soldiers>{
        int id;int count;
        Soldiers(int id,int count){
            this.id=id;
            this.count=count;
        }
        @Override
        public int compareTo(Soldiers s){
            if (this.count == s.count)return this.id - s.id;
            return this.count - s.count;
        }
    }
    static int[] weakRows(int arr[][],int k){
        int m=arr.length;
        int n=arr[0].length;
        PriorityQueue<Soldiers> pq=new PriorityQueue<>();
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n && arr[i][j]==1;j++)count++;
            Soldiers s=new Soldiers(i,count);
            pq.add(s);
        }
        int ids[]=new int[k];
        for(int i=0;i<k;i++){
            ids[i]=pq.remove().id;
        }
        return ids;
    } 
    public static void main(String args[]){
        int arr[][]={{1,0,0,0},{1,1,1,1},{1,1,0,0},{1,1,1,0}};
        System.out.println("Weakest Soldiers: "+Arrays.toString(weakRows(arr,2)));
    }
}
