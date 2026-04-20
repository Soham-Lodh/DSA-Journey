import java.util.*;
public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++)System.out.print(" ");
            for(int j=0;j<n-(n-i);j++)System.out.print(i);
            for(int j=1;j<n-(n-i);j++)System.out.print(i);
            System.out.println();
        }
    }
}
