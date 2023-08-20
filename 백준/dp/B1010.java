package dp;

import java.math.BigInteger;
import java.util.Scanner;

public class B1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		BigInteger[] dp = new BigInteger[31];
		dp[0] = BigInteger.valueOf(1);
		
		for (int i = 1; i <= 30; i++) {
			dp[i] = BigInteger.valueOf(i).multiply(dp[i-1]);
		}
		
		for (int i = 0; i < testCase; i++) {
			int n = sc.nextInt(), m = sc.nextInt();
			
			BigInteger result =  dp[m].divide(dp[n].multiply(dp[m-n]));
		
			System.out.println(result);
		}
		
		sc.close();
	}
}
