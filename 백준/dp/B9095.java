package dp;

import java.util.Scanner;

public class B9095 {
	public static void main(String[] args ) {
		// 정수 1, 2, 3써서 특정 정수 만드는 방법 수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int TESTCASE = sc.nextInt();
		
		int max = 0;
		int[] arr = new int[TESTCASE];
		
		for (int i = 0; i < TESTCASE; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		if (max < 4) {
			int[] dp = new int[4];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for (int i = 0; i < TESTCASE; i++) {
				System.out.println(dp[arr[i]]);
			}
		} else {
			int[] dp = new int[max+1];
			
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for (int i = 4; i <= max; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			
			for (int i = 0; i < TESTCASE; i++) {
				System.out.println(dp[arr[i]]);
			}
		}
		
		sc.close();
	}
}
