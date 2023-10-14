package dp;

import java.io.*;
import java.util.*;

public class B12865 {
	static int N, K, maxV;
	static int[] W, V;
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		// 이 문제는 아주 평범한 배낭에 관한 문제
		// 한달 뒤 군대가는 준서는 여행을 가려 함
		// 최대한 가치있게 배낭을 싸려함
		// 준서가 필요하다고 생각하는 N개의 물건이 있다.
		// 각 물건은 무개 W, 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다.
		// 최대 K만큼의 무게만 넣을 수 있음
		// 가방에 넣을 수 있는 가지의 최댓값 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		W = new int[N];
		V = new int[N];
		dp = new int[N+1][K+1];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		if (N == 1) {
			if (K >= W[0]) {
				bw.write(V[0] + "\n");
			} else {
				bw.write(maxV + "\n");
			}
		} else {
			for (int i = 0; i < N-1; i++) {
				for (int j = i; j < N; j++) {
					if (W[i] > W[j]) { 
						int temp = W[i];
						W[i] = W[j];
						W[j] = temp;
						
						temp = V[i];
						V[i] = V[j];
						V[j] = temp;
					}
				}
			}		
			
			for (int i = 0; i < N; i++) {
				for (int j = W[i]; j <= K; j++) {
					if (i == 0) dp[i][j] = V[i];
					else {
						dp[i][j] = Math.max(dp[i-1][j],  dp[i-1][j - W[i]] + V[i]);
						maxV = Math.max(maxV,  dp[i][j]);
					}
					for (int l = i; l <N; l++) { // 이 칸이 비어있으면 계산 시 0이 들어가 오답나올수있는 반례가 있음
						dp[l][j] = dp[i][j];
					}
				}
			}
			bw.write(maxV + "\n");
		}		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
