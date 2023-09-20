package dp;

import java.io.*;
import java.util.*;

public class B16493 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] days = new int[m], pages = new int[m], dp = new int[n+1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			days[i] = Integer.parseInt(st.nextToken());
			pages[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = n; j >= days[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-days[i]] + pages[i]);
			}
		}
		bw.write(dp[n] + "\n");
		
		bw.flush();
		bw.close();
		br.close();	
	}
}
