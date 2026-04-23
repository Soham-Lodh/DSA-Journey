public class shortest_path {
    static double path(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'||str.charAt(i)=='e')x++;
            else if(str.charAt(i)=='W'||str.charAt(i)=='w')x--;
            else if(str.charAt(i)=='N'||str.charAt(i)=='n')y++;
            else if(str.charAt(i)=='S'||str.charAt(i)=='s')y--;
        }
        return Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "EENW";
        System.out.println(path(path));

    }
}
