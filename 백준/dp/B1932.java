package dp;

import java.io.*;
import java.util.*;

public class B1932 {
	static int N, maxSum;
	static int[][] arr, dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dp = new int [N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = arr[0][0];
		for (int i = 1; i < N; i++) {
			dp[i][0] = dp[i-1][0] + arr[i][0];
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i-1][j] + arr[i][j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			maxSum = Math.max(maxSum,  dp[N-1][i]);
		}
		
		bw.write(maxSum + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}