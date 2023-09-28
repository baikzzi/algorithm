package dp;

import java.io.*;

public class B24417 {
	static int N, cnt;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		dp[1] = 1;
		dp[2] = 1;
		 
		for (int i = 3; i <= N; i++) {
			 dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
			 cnt++;
		}
		bw.write(dp[N] + " " + cnt + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
