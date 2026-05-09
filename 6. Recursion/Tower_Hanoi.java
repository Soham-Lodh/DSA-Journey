public class Tower_Hanoi {
    static int steps(int n, String from, String to, String help) {
        if(n==1){
            System.out.println("Moved "+n+" from "+from+" to "+to);
            return 1;
        }
        int steps=0;
        steps+=steps(n-1,from,help,to);
        System.out.println("Moved "+n+" from "+from+" to "+to);
        steps++;
        steps+=steps(n-1,help,to,from);
        return steps;
    }
    public static void main(String[] args) {
        int n = 3;
        int total = steps(n, "S", "D", "H");
        System.out.println("Total Steps = " + total);
        
    }
}