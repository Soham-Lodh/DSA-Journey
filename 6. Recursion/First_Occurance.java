public class First_Occurance {
    static int check_first(int arr[],int n,int i){
        if(i==arr.length-1)return -1;
        else if(arr[i]==n)return i;
        else return check_first(arr,n,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=99;
        System.out.println(check_first(arr,n,0));
    }
}
