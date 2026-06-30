import java.util.*;
public class JobSequencing {
    static int sequence(int []start,int []value){
        int arr[][]=new int[start.length][3];
        int maxTime=Integer.MIN_VALUE;
        for(int i=0;i<start.length;i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            maxTime=Math.max(start[i],maxTime);
            arr[i][2]=value[i];
        }
        Arrays.sort(arr, (a, b) -> Double.compare(b[2], a[2]));
        int time=0;
        int val=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(time<=maxTime){
            for(int i=0;i<arr.length;i++){
                if(arr[i][1]==time){
                    val+=arr[i][2];
                    list.add(i);
                    break;
                }
            }
            time++;
        }
        System.out.print("Jobs: ");
        for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");
        System.out.println();
        return val;
    }
    public static void main(String [] args){
        System.out.println(sequence(new int[]{4,1,1,1},new int[]{20,10,40,30}));
    }
}
