package mod7_intern_for_Tbank;

import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] rowSum = new int[n];
        int[] columnSum = new int[n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += matrix[i][j];
                columnSum[j] += matrix[i][j];
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(rowSum[i] - columnSum[j]) <= matrix[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}
