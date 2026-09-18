import java.util.*;
class KNearestCars{
    static class Points implements Comparable<Points>{
        int x,y,d;
        Points(int x,int y,int d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
        @Override
        public int compareTo(Points p){
            return this.d-p.d;
        }
    }
    public static void main(String args[]){
        int points[][]={{-2,4},{3,3}};
        PriorityQueue<Points> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int d=(x*x)+(y*y);
            Points p=new Points(x,y,d);
            pq.add(p);
        }
        int k=1;
        int arr[][]=new int[k][2];
        for(int i=0;i<k;i++){
            Points p=pq.remove();
            arr[i][0]=p.x;
            arr[i][1]=p.y;
        }
        System.out.println("K Nearest Cars: " + Arrays.deepToString(arr));
    }
}