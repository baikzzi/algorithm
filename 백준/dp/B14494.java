package dp;

import java.util.Scanner;

public class B14494 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		long[][] dp = new long[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = (dp[i-1][j] + dp[i][j-1] + dp[i-1][j-1]) % 1000000007;
				}
			}
		}
		
		System.out.println(dp[n-1][m-1]);
		
		
		sc.close();
	}
}
