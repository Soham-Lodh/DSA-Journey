
import java.util.*;

public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();

        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                lst.add(matrix[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                lst.add(matrix[i][endCol]);
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    lst.add(matrix[endRow][i]);
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    lst.add(matrix[i][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return lst;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);

    }
}
