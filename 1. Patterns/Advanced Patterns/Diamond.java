import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--)System.out.print(" ");
            for(int j=1;j<=n-(n-i);j++)System.out.print("*");
            for(int j=2;j<=n-(n-i);j++)System.out.print("*");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-(n-i);j++)System.out.print(" ");
            for(int j=n-i;j>=0;j--)System.out.print("*");
            for(int j=n-i-1;j>=0;j--)System.out.print("*");
            System.out.println();
        }
    }
}
