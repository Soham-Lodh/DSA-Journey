import java.util.*;
public class NextGreaterElement{
    static int[] greater_brute_force(int arr[]){
        int nums[]=new int[arr.length];
        nums[arr.length-1]=-1;
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    max=Math.max(arr[j],arr[i]);
                    break;
                }
            }
            if(max==arr[i])nums[i]=-1;
            else nums[i]=max;
        }
        return nums;
    }
    static int[] greater_optimized(int arr[]){
        int nums[]=new int[arr.length];
        Arrays.fill(nums,-1);
        Stack<int[]> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()[0]<arr[i]){
                int idx=stack.pop()[1];
                nums[idx]=arr[i];
            }
            stack.push(new int[]{arr[i],i});
        }
        return nums;
    }
    static int[] optimized(int arr[]){
        int nums[]=new int[arr.length];
        Arrays.fill(nums,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i])stack.pop();
            if(!stack.isEmpty() && stack.peek()>arr[i])nums[i]=stack.peek();
            stack.push(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ans[]=greater_brute_force(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        ans=greater_optimized(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        ans=optimized(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}