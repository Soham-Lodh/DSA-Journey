
import java.util.*;

public class NKnights {

    static void solve(int board[][], int i, int j, int count) {
        if (i < 0 || j < 0 || i >= board.length || j >= board.length) {
            return; 
        }else if (board[i][j] != -1) {
            return; 
        }else if (count == (board.length * board.length) - 1) {
            board[i][j] = count;
            print2D(board);
            System.out.println();
            board[i][j] = -1;
            return;
        } else {
            board[i][j] = count;
            solve(board, i + 2, j + 1, count + 1);
            solve(board, i + 2, j - 1, count + 1);
            solve(board, i - 2, j + 1, count + 1);
            solve(board, i - 2, j - 1, count + 1);
            solve(board, i + 1, j + 2, count + 1);
            solve(board, i - 1, j + 2, count + 1);
            solve(board, i + 1, j - 2, count + 1);
            solve(board, i - 1, j - 2, count + 1);
            board[i][j] = -1;
        }
    }

    static void print2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], -1);
        }
        solve(board, 0, 0, 0);
    }
}
