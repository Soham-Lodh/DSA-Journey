import java.util.*;
public class ChoclateProblem {
    static int MinCost(Integer vertical[],Integer horizontal[]){
        int vp=1,hp=1;
        int cost=0;
        Arrays.sort(vertical,Collections.reverseOrder());
        Arrays.sort(horizontal,Collections.reverseOrder());
        int i=0,j=0;
        while(i<horizontal.length && j<vertical.length){
            if(horizontal[i]>=vertical[i]){
                cost+=vp*horizontal[i];
                hp++;
                i++;
            }
            else{
                cost+=hp*vertical[j];
                vp++;
                j++;
            }
        }
        while(i<horizontal.length){
            cost+=vp*horizontal[i];
            hp++;
            i++;
        }
        while(j<vertical.length){
            cost+=hp*vertical[j];
            vp++;
            j++;
        }
        return cost;
    }
    public static void main(String[] args) {
        System.out.println(MinCost(new Integer[]{2,1,3,1,4},new Integer[]{4,1,2}));
    }
}
