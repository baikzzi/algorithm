package dp;

import java.io.*;
import java.util.*;

public class B14430 {
	static int N, M;
	static int[][] dp, arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		dp = new int[N][M];		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if (arr[0][0] == 1) { // 시작점 dp배열 채우기
			dp[0][0] = 1;
		}
		for (int i = 1; i < N; i++) { // 1행 채우기
			if (arr[i][0] == 1) {
				dp[i][0] = dp[i-1][0] + 1;
			} else {
				dp[i][0] = dp[i-1][0];
			}
		}
		for (int i = 1; i < M; i++) { // 1열 채우기
			if (arr[0][i] == 1) {
				dp[0][i] = dp[0][i-1] + 1;
			} else {
				dp[0][i] = dp[0][i-1];
			}
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < M; j++) {
				if (arr[i][j] == 1) {
					dp[i][j] = Math.max(dp[i-1][j],  dp[i][j-1]) + 1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j],  dp[i][j-1]);
				}
			}
		}
		
		bw.write(dp[N-1][M-1] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}