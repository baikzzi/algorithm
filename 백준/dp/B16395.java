package dp;

import java.util.Scanner;

public class B16395 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		if (n < 3 || k == 1 || k == n) {
			System.out.println(1);
		} else {
			int[][] arr = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || i == j) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					}
				}
			}
			
			System.out.println(arr[n-1][k-1]);
		}
		
		
		sc.close();
	}
}
