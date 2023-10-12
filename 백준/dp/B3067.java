package dp;

import java.io.*;
import java.util.*;

public class B3067 {
	static int TESTCASE, numCoin, amount;
	static int[] coin, dp;
	public static void main(String[] args) throws IOException {
		// 동전 1, 5, 10, 50, 100, 500원으로 모든 정수 금액 만들 수 있음
		// 동전의 종류가 주어질 때 주어진 금액을 만드는 모든 방법을 세는 프로그램을 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		TESTCASE = Integer.parseInt(br.readLine());
		
		while (TESTCASE-- > 0) {
			numCoin = Integer.parseInt(br.readLine());
			coin = new int[numCoin];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < numCoin; i++) {
				coin[i] = Integer.parseInt(st.nextToken());
			}
			amount = Integer.parseInt(br.readLine());
			dp = new int[amount+1];
			dp[0] = 1;
			
			for (int i : coin) {
				for (int j = i; j <= amount; j++) {
					dp[j] += dp[j-i];
				}
			}
			
			bw.write(dp[amount] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
