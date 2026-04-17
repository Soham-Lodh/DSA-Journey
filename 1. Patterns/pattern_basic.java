package Patterns;
import java.util.*;
public class pattern_basic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // 1
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<a;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // 2
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
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

        // 3
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=0;i<=a;i++){
        //     for(int j=0; j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=0;i<=a;i++){
        //     for(int j=a; j>=i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 5
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=0;i<=a;i++){
        //     for(int j=0; j<=a;j++){
        //        if(i+j>=a){
        //         System.out.print("*");
        //        }
        //        else{
        //         System.out.print(" ");
        //        }
        //     }
        //     System.out.println();
        // }

        // 6
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 7
        // System.out.print("Number: ");
        // int a=sc.nextInt();
        // for(int i=0;i<=a;i++){
        //     for(int j=1; j<=a;j++){
        //         if(i+j<=a){
        //             System.out.print(j);
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
        // int k=1;
        // for(int i=0;i<=a;i++){
        //     for(int j=0; j<i;j++){
        //         System.out.print(k+" ");
        //         k++;
        //     }
        //     System.out.println();
        // }

        // 9
        System.out.print("Number: ");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0; j<i;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
