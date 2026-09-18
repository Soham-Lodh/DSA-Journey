class Solution {
    class Points implements Comparable<Points>{
        int x;
        int y;
        int d;
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
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Points> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int d=(x*x)+(y*y);
            Points p=new Points(x,y,d);
            pq.add(p);
        }
        int arr[][]=new int[k][2];
        for(int i=0;i<k;i++){
            Points p=pq.remove();
            arr[i][0]=p.x;
            arr[i][1]=p.y;
        }
        return arr;
    }
}