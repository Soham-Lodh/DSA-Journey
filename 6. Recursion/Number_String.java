public class Number_String {
	static void converter(int n) {
	    if(n<=0)return;
		String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		int i=n%10;
		converter(n/10);
		System.out.print(digits[i]+" ");
	}
	public static void main(String[] args) {
	    int n=2021;
        converter(n);
	}
}
