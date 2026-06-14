class Sudoku_Solver{
    static boolean solve(int board[][]) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]==0) {
					for(int k=1; k<=9; k++) {
					    if(isSafe(board,i,j,k)) {
							board[i][j]=k;
							if(solve(board))return true;
						    board[i][j]=0;
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	static boolean isSafe(int board[][],int i,int j,int digit) {
		for(int k=0; k<board.length; k++) {
			if(k!=i && board[k][j]==digit)return false;
		}
		for(int k=0; k<board.length; k++) {
			if(k!=j && board[i][k]==digit)return false;
		}
		int startRow = i - i % 3;
		int startCol = j - j % 3;

		for (int row = startRow; row < startRow + 3; row++) {
			for (int col = startCol; col < startCol + 3; col++) {
				if (board[row][col] == digit) {
					return false;
				}
			}
		}
		return true;
	}
	static void printSudoku(int[][] board) {
		for (int row = 0; row < 9; row++) {
			if (row % 3 == 0 && row != 0) {
				System.out.println("------+-------+------");
			}
			for (int col = 0; col < 9; col++) {
				if (col % 3 == 0 && col != 0) {
					System.out.print("| ");
				}
				if (board[row][col] == 0) {
					System.out.print(". ");
				} else {
					System.out.print(board[row][col] + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] sudoku = {
			{0, 0, 8, 0, 0, 0, 0, 0, 0},
			{4, 9, 0, 1, 5, 7, 0, 0, 2},
			{0, 0, 3, 0, 0, 4, 1, 9, 0},

			{1, 8, 5, 0, 6, 0, 0, 2, 0},
			{0, 0, 0, 0, 2, 0, 0, 6, 0},
			{9, 6, 0, 4, 0, 5, 3, 0, 0},

			{0, 3, 0, 0, 7, 2, 0, 0, 4},
			{0, 4, 9, 0, 3, 0, 0, 5, 7},
			{8, 2, 7, 0, 0, 9, 0, 1, 3}
		};
		if(!solve(sudoku)) {
			System.out.println("Sudoku can't be solved");
		}
		else {
			printSudoku(sudoku);
		}
	}
}