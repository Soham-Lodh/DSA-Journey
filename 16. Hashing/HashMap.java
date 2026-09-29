import java.util.*;
public class HashMap {
    static class HashCode<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        
        // @SuppressWarnings("unchecked");
        HashCode(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
            
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            hc=Math.abs(hc);
            return hc%this.N;
        }
        private int SearchInLL(K key,int idx){
            LinkedList<Node>ll=buckets[idx];
            for(int i=0;i<ll.size();i++){
                Node k=ll.get(i);
                if(k.key==key)return i;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++)buckets[i]=new LinkedList<>();
            
        }
        public void put(K key,V value){
            int idx=hashFunction(key);
            int dIdx=SearchInLL(key,idx);
            if(dIdx>=0){
                buckets[idx].get(dIdx).value=value;
            }
            else{
                buckets[idx].add(new Node(kew,value));
                n++;
            }
            double lambda=n/N;
            if(lambda>2.0)
        }
    }
}
