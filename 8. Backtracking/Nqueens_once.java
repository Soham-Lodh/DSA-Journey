import java.util.*;
public class Nqueens_once {
    static boolean nQueens(char board[][], int i) {
        if (i == board.length) {
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                if(nQueens(board, i + 1)) {
                    return true;
                }
                board[i][j] = 'X';
            }
        }
        return false;
    }

    static boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; j < board[0].length && i >= 0; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board, 0)){
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
