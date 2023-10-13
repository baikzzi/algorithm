package dp;

import java.io.*;
import java.util.*;

public class B2293 {
	static int N, K;
	static int[] coin, dp;
	public static void main(String[] args) throws IOException {
		// n가지의 서로다른 종류의 동전으로 k원이 되도록 하고싶다.
		// 그 경우의 수를 구하여라
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		coin = new int[N];
		dp = new int[K + 1];
		dp[0] = 1;
		
		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i : coin) {
			for (int j = i; j <= K; j++) {
				dp[j] += dp[j-i];
			}
		}
		
		bw.write(dp[K] + "\n");
				
		bw.flush();
		bw.close();
		br.close();
	}
}
