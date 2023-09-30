package dp;

import java.io.*;

public class B14650 {
	static int N;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		
		dp[1] = 0;
		
		if (N == 1) {
			bw.write(dp[1] + "\n");
		} else if (N == 2) {
			bw.write(2 + "\n");
		} else {
			dp[2] = 2;
			for (int i = 3; i <= N; i++) {
				dp[i] = dp[i-1] * 3;
			}
			bw.write(dp[N] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
