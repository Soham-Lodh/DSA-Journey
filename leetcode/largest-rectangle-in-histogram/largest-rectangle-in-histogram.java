class Solution {
    public int largestRectangleArea(int[] heights) {
        int nsr[]=nsr(heights);
        int nsl[]=nsl(heights);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int area=(nsr[i]-nsl[i]-1)*heights[i];
            max=Math.max(area,max);
        }
        return max;
    }
    int[] nsl(int arr[]){
        int nsl[]=new int[arr.length];
        Arrays.fill(nsl,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])stack.pop();
            if(!stack.isEmpty())nsl[i]=stack.peek();
            stack.push(i);
        }
        return nsl;
    }
    int[] nsr(int arr[]){
        int nsr[]=new int[arr.length];
        Arrays.fill(nsr,arr.length);
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])stack.pop();
            if(!stack.isEmpty())nsr[i]=stack.peek();
            stack.push(i);
        }
        return nsr;
    }
}