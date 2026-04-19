import java.util.*;
public class HollowButterfly {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||j==1||i==n||j==n)System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=n-i;j>0;j--)System.out.print(" ");
            for(int j=n-i;j>0;j--)System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(i==1||j==1||i==n||j==n)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>0;j--){
                if(i==1||j==1||i==n||j==n)System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1;j<i;j++)System.out.print(" ");
            for(int j=1;j<i;j++)System.out.print(" ");
            for(int j=n-i+1;j>0;j--){
                if(i==1||j==1||i==n||j==n)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}