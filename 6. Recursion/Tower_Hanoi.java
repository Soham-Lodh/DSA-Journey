public class Tower_Hanoi {
    static void steps(int n, String from, String to, String help) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + from + " to " + to);
            return;
        }
        steps(n - 1, from, help, to);
        System.out.println("Transfer disk " + n + " from " + from + " to " + to);
        steps(n - 1, help, to, from);
    }
    public static void main(String[] args) {
        int n = 3;
        steps(n, "S", "D", "H");
    }
}