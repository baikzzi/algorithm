package dp;

import java.io.*;
import java.util.*;

public class B11052 {
	static int N;
	static int[] price, dp;
	public static void main(String[] args) throws IOException {
		// PS(Problem Solving) 카드를 모으는 것이 유행
		// 각 카드에는 등급을 나타내는 색이 칠해져있고, 8가지가 있음
		// 전설, 레드, 오렌지, 퍼플, 블루, 청록, 그린, 그레이
		// 카드팩 형태로만 구매 가능, 카드팩의 종류는 각각 1개부터 N개까지 포함된 카드팩 N가지 존재
		// 민규는 카드 개수가 적은 카드팩이라도 비싸면 높은 등급의 카드가 많을 거라는 미신을 믿음
		// 돈을 최대한 많이 지불해서 N개를 구매하려함
		// 카드 i개가 포함된 카드팩의 가격은 Pi이다.
		// ex) 1~4개 카드팩의 가격이 각각 1, 5, 6, 7원일때 4개 카드를 비싸게 사는 방법은
		// 2개짜리 2개사는게 10원으로 제일 비쌈
		// 카드팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 지불해야하는 금액의 최대값구하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		price = new int[N+1];
		dp = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			price[i] = Integer.parseInt(st.nextToken());			
		}
		
		dp[1] = price[1];
		
		if (N == 2) {
			dp[2] = Math.max(price[2], dp[1] + price[1]);
		} else if (N == 3) {
			dp[2] = Math.max(price[2], dp[1] + price[1]);
			dp[3] = Math.max(price[3], dp[2] + dp[1]);
		} else {
			dp[2] = Math.max(price[2], dp[1] + price[1]);
			dp[3] = Math.max(price[3], dp[2] + dp[1]);
			for (int i = 4; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i-j >= 0) dp[i] = Math.max(dp[i], dp[i-j] + price[j]);
				}
			}
		}
		bw.write(dp[N] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
