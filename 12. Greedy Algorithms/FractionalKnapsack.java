import java.util.*;
public class FractionalKnapsack {
    static double maxValue(int value[],int weight[],int maxWeight){
        double[][] arr=new double[value.length][4];
        for(int i=0;i<value.length;i++){
            arr[i][0]=i;
            arr[i][1]=value[i];
            arr[i][2]=weight[i];
            arr[i][3]=(double)(value[i])/weight[i];
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        double val=0;
        Arrays.sort(arr, (a, b) -> Double.compare(b[3], a[3]));
        for(int i=0;i<arr.length && maxWeight>0;i++){
            ArrayList<Integer> lst=new ArrayList<>();
            lst.add((int)arr[i][0]);
            int w = (int) Math.min(maxWeight, arr[i][2]);
            lst.add(w);
            val+=w*arr[i][3];
            maxWeight-=w;
            list.add(lst);
        }
        for(int i=0;i<list.size();i++){
            System.out.print("Item: "+list.get(i).get(0)+" Weight: "+list.get(i).get(1));
            System.out.println();
        }
        return val;
    }
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int maxWeight=50;
        System.out.println("Max Value: "+maxValue(value,weight,maxWeight));
    }
}
