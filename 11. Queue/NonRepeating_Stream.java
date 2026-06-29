
import java.util.*;

public class NonRepeating_Stream {

    static void normal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the stream: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter character: ");
            char ch = sc.next().charAt(0);
            if (!sb.toString().contains(String.valueOf(ch))) {
                res.append(ch);
                sb.append(ch);
            } else {
                int idx = res.indexOf(String.valueOf(ch));
                if (idx != -1) {
                    res.deleteCharAt(idx);
                }
                sb.append(ch);
            }
            System.out.println("Stream: " + sb.toString());
            if (res.length() == 0) {
                System.out.println("Result: -1");
            } else {
                System.out.println("Result: " + res.charAt(0));
            }
        }
    }
    static void optimized(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the stream: ");
        int n = sc.nextInt();
        int arr[]=new int[26];
        Queue<Character> queue=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter character: ");
            char ch=sc.next().charAt(0);
            arr[ch-'a']++;
            queue.offer(ch);
            while(!queue.isEmpty()){
                char ak=queue.peek();
                if(arr[ak-'a']>1)queue.poll();
                else if(arr[ak-'a']==1){
                    System.out.println("Non repeating character: "+ak);
                    break;
                }
            }
            if(queue.isEmpty()){
                System.out.println("Non repeating character: "+-1);
            }
        }
    }

    public static void main(String[] args) {
        optimized();
    }
}
