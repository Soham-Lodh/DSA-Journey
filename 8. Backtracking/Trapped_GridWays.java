public class Trapped_GridWays {
    static void solve(int maze[][],int i,int j,int sol[][]) {
		if(i>=maze.length || j>=maze[0].length)return;
		else if(maze[i][j]==0)return;
		else if(i==maze.length-1 && j==maze[0].length-1) {
			sol[i][j]=1;
			print2D(sol);
			System.out.println();
			sol[i][j] = 0;
			return;
		}
		else {
			sol[i][j]=1;
			solve(maze,i+1,j,sol);
			solve(maze,i,j+1,sol);
			sol[i][j]=0;
		}
	}
	static void print2D(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int maze[][] = {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		int arr[][]=new int[maze.length][maze[0].length];
		solve(maze,0,0,arr);
	}
}
