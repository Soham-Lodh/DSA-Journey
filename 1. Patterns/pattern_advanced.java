package Patterns;
import java.util.*;
public class pattern_advanced {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // 1
        // int j;
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(a-i);
        //     for(j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=a;i>=1;i--){
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(a-i);
        //     for(j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2
        // int j;
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(j=1;j<=i;j++){
        //         if(j==i||j==1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     int space=2*(a-i);
        //     for(j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++){
        //         if(j==i||j==1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=a;i>=1;i--){
        //     for(j=1;j<=i;j++){
        //         if(j==i||j==1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     int space=2*(a-i);
        //     for(j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=i;j++){
        //         if(j==i||j==1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 3
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // 5
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 6
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=a-1;i>=1;i--){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 7
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=a;j++){
        //         if(i==1||j==1||j==a||i==a){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 8
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // 9
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=a-i;j>=1;j--){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //10
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=a;j>=i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
