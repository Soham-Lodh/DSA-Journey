public class Print_Occurance {
    static void search(int arr[],int key,int i){
        if(i>=arr.length)return;
        if(arr[i]==key)System.out.println(i);
        search(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        search(arr, key, 0);
    }
}
