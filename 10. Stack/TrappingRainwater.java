import java.util.*;
public class TrappingRainwater {
    static int water(int arr[]){
        int water=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                int h=arr[stack.pop()];
                if(stack.isEmpty())break;
                int w=(Math.min(arr[stack.peek()],arr[i])-h)*(i-stack.peek()-1);
                water+=w;
            }
            stack.push(i);
        }
        return water;
    }
    public static void main(String args[]){
        int arr[]={7,4,0,9,1,3,5,2,6};
        System.out.println(water(arr));
    }
}
