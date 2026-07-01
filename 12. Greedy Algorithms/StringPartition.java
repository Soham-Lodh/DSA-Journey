class StringPartition{
    static int partition(String s){
        int l=0,r=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')l++;
            else r++;
            if(l==r)count++;
        }
        return count;
    }
    public static void main(String args[]){
        String s="LRRRRLLRLLRL";
        System.out.println(partition(s));
    }
}