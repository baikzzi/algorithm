package dp;

import java.io.*;
import java.util.*;

public class B9084 {
	static int TESTCASE, N, amount;
	static int[] coin, dp;
	public static void main(String[] args) throws IOException {
		// 1, 5, 10, 50, 100, 500원 동전
		// 동전의 종류가 주어질 때 주어진 금액 만들수 있는 모든 방법을 세는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		TESTCASE = Integer.parseInt(br.readLine());
		
		while (TESTCASE-- > 0) {
			N = Integer.parseInt(br.readLine());
			coin = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				coin[i] = Integer.parseInt(st.nextToken());
			}
			
			amount = Integer.parseInt(br.readLine());
			dp = new int[amount + 1];
			dp[0] = 1;
			
			for (int won : coin) {
				for (int i = won; i <= amount; i++) {
					dp[i] += dp[i - won]; // @@@
				}
			}
			bw.write(dp[amount] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
