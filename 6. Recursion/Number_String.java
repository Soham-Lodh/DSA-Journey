public class Number_String {
	static void rev_conv(StringBuilder sb,int n) {
		if(n<=0)return;
		sb.append(n%10);
		rev_conv(sb,n/10);
	}
	static void print(StringBuilder old,StringBuilder sb,int n) {
		if(n==old.length()){
            System.out.println(sb);
            return;
        }
		switch (old.charAt(n)) {
		case '0':
			sb.append("zero");
			break;
		case '1':
			sb.append("one");
			break;
		case '2':
			sb.append("two");
			break;
		case '3':
			sb.append("three");
			break;
		case '4':
			sb.append("four");
			break;
		case '5':
			sb.append("five");
			break;
		case '6':
			sb.append("six");
			break;
		case '7':
			sb.append("seven");
			break;
		case '8':
			sb.append("eight");
			break;
		case '9':
			sb.append("nine");
			break;
		default:
			break;
		}
        sb.append(" ");
		print(old,sb,n+1);
	}
	public static void main(String[] args) {
	    int n=2021;
        StringBuilder sb = new StringBuilder();
        rev_conv(sb,n);
        StringBuilder sb1 = new StringBuilder();
        sb.reverse();
        print(sb,sb1,0);
	}
}
