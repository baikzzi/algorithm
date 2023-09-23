package dp;

import java.io.*;
import java.util.StringTokenizer;

public class B16194 {
	static int N;
	static int[] dp, cost;
	public static void main(String[] args) throws IOException {
		// ps(problem solving)분야에서 유명한 사람들의 아이디와 얼굴이 적혀있는 ps카드
		// 각각의 카드에는 등급을 나타내는 색이 칠해져있고 8가지임
		// 카드는 카드팩의 형태로만 구매 가능
		// 카드팩의 종류는 각각 1 ~ N개가 포함된 N가지가 존재
		// 민규는 최소 비용 지불하여 N개를 구매 원함, 카드가 i개 포함된 카드팩의 가격은 Pi원
		// ex) 4종류 >> P1 = 1, P2 = 5, P3 = 6, P4 = 7인 경우 4개를 갖기 위해 1개짜리 4번 최소 4원
		// P1 = 5, P2 = 2, P3 = 8, P4 = 10인 경우 4개를 갖기 위해 2개짜리 2번으로 4원
		// N개의 카드를 구매하기 위한 최소비용 구하는 프로그램 작성
		// 정확히 N개만 사야함 @@
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) dp[i] = Integer.parseInt(st.nextToken());		
		
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j < i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j] + dp[j]);
			}
		}
		bw.write(dp[N] + "\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
