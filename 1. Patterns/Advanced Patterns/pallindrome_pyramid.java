import java.util.*;
public class pallindrome_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=0;j<n-i;j++)System.out.print(" ");
            for(int j=0;j<n-(n-i);j++){
                System.out.print(k);
                k--;
            }
            k=2;
            for(int j=1;j<n-(n-i);j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
