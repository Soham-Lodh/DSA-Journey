import java.util.*;
public class StockSpan {
    static int maxSpan(int prices[]){
        Stack<int[]> stack=new Stack<>();
        int maxSpan=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int span=1;
            while(!stack.isEmpty() && stack.peek()[0]<=prices[i]){
                span+=stack.pop()[1];
            }
            stack.push(new int []{prices[i],span});
            maxSpan=Math.max(span,maxSpan);
        }
        return maxSpan;
    }
    public static void main(String args[]){
        int prices[]={100,80,60,70,60,85,100};
        System.out.println(maxSpan(prices));
    }
}
