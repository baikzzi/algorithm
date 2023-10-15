package dp;

import java.io.*;
import java.util.*;

public class B2294 {
	static int N, K;
	static int[] coin, dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		coin = new int[N];
		dp = new int[K+1];
		
		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
			if (coin[i] > K) continue;
			dp[coin[i]] = 1;
		}
		
		for (int coin : coin) {
			for (int i = coin; i <= K; i++) {
				if (dp[i-coin] == 0) continue;
				if (dp[i] == 0) dp[i] = dp[i-coin] + 1;
				else dp[i] = Math.min(dp[i], dp[i-coin] + 1);
			}
		}
		
		if (dp[K] == 0) bw.write(-1 + "\n");
		else bw.write(dp[K] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
