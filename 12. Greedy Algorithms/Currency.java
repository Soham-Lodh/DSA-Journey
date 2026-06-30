import java.util.*;
public class Currency {
    static int count(int currency[], int val) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = currency.length - 1; i >= 0; i--) {
            while (currency[i] <= val) {
                val -= currency[i];
                list.add(currency[i]);
                count++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "+"); 
            }else {
                System.out.print(list.get(i));
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int currency[] = {1, 2, 5, 10, 20, 50, 100};
        int val = 93;
        System.out.println("Minimum number of coins: " + count(currency, val));
    }
}
