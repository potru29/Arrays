import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int result[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = sc.nextInt();

            }

        }
        System.out.println("The Spiral Order Matrix is : ");
        int row_start = 0;
        int col_start = 0;
        int row_end = rows - 1;
        int col_end = cols - 1;
        while (row_start <= row_end && col_start <= col_end) {
            for (int j = col_start; j <= col_end; j++) {
                System.out.print(result[row_start][j] + " ");
            }
            row_start++;
            for (int j = row_start; j <= row_end; j++) {
                System.out.print(result[j][col_end] + " ");
            }
            col_end--;
            for (int j = col_end; j >= col_start; j--) {
                System.out.print(result[row_end][j] + " ");
            }
            row_end--;
            for (int j = row_end; j >= row_start; j--) {
                System.out.print(result[j][col_start] + " ");
            }
            col_start++;
            System.out.println();

        }

    }
}