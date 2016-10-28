package advanced_java;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Камилла on 10.10.2016.
 */
public class MultiplyMatrix {
    public static int[][] Multiply(int x[][], int y[][]) {
        int a = x.length;
        int b = y[1].length;
        int n = x[1].length;
        int res[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                res[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    res[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        }

        int[][] b = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++)
                b[i][j] = in.nextInt();
        }
        int[][] c = new int[n][y];
        if (m != x) out.println("Такие матрицы перемножить нельзя");
        else c = Multiply(a, b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                out.println(c[i][j]);
            }
        }
        out.flush();
    }
}