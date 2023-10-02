package dp;

import java.io.*;
import java.util.*;

public class B1149 {
	static int N, ans;
	static int[][] cost, dp;
	public static void main(String[] args) throws IOException {
		// RGB거리에 N개의 집, 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번집이 순서대로 있다
	    // 집은 빨, 초, 파 중 하나로 색칠해야함
	    // 각각의 집을 빨, 초, 파로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값
	    // 1번 집의 색은 2번 집의 색과 같지 않아야 함
	    // N번 집의 색은 N-1번 집의 색과 같지 않아야 함
	    // 2~N-1번 집의 색은 각각 좌 우 집의 색과 달라야 함
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st;
	    N = Integer.parseInt(br.readLine());
	    cost = new int[N][3];
	    dp = new int[N][3];
	    
	    for (int i = 0; i < N; i++) {
	       st = new StringTokenizer(br.readLine());
	       for (int j = 0; j < 3; j++) {
	          cost[i][j] = Integer.parseInt(st.nextToken());
	       }
	    }
	    dp[0][0] = cost[0][0];
	    dp[0][1] = cost[0][1];
	    dp[0][2] = cost[0][2];
	    
	    for (int i = 1; i < N; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		if (j == 0) {
	    			dp[i][j] = Math.min(cost[i][j] + dp[i-1][1], cost[i][j] + dp[i-1][2]);
	    		} else if (j == 1) { 
	    			dp[i][j] = Math.min(cost[i][j] + dp[i-1][0], cost[i][j] + dp[i-1][2]);
	    		} else {
	    			dp[i][j] = Math.min(cost[i][j] + dp[i-1][0], cost[i][j] + dp[i-1][1]);
	    		}	
	    	}
	    }
	    ans = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
	    bw.write(ans + "\n");  
	    bw.flush();
	    bw.close();
	    br.close();
	}  
}