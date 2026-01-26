class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        digits[digits.length-1]++;
        int i=digits.length-1;
        while(i>0){
            if(digits[i]>9){
                digits[i]=0;
                digits[i-1]+=1;
            }
            i--;
        }
        if(digits[0]>=10){
            int arr[]=new int[digits.length+1];
            arr[0]=1;
            i=1;
            while(i<digits.length){
                arr[i]=digits[i-1]%10;
                i++;
            }
            return arr;
        }
        return digits;
    }
}