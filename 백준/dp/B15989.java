package dp;

import java.io.*;

public class B15989 {
	static int TESTCASE, maxN;
	static int[] coin, dp;
	public static void main(String[] args) throws IOException {
		// n�� �־����� ��, 1, 2, 3���� n�� ��Ÿ���� ����� ���� ���ϴ� ���α׷� �ۼ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TESTCASE = Integer.parseInt(br.readLine());
		coin = new int[TESTCASE];
		for (int i = 0; i < TESTCASE; i++) {
			coin[i] = Integer.parseInt(br.readLine());
			maxN = Math.max(maxN,  coin[i]);
		}
		
		dp = new int[maxN + 1];
		dp[0] = 1;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= maxN; j++) {
				dp[j] += dp[j - i];
			}
		}
		
		for (int i : coin) {
			bw.write(dp[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}