package dp;

import java.io.*;
import java.util.*;

public class B1149 {
	static int N, ans;
	static int[][] cost, dp;
	public static void main(String[] args) throws IOException {
		// RGB�Ÿ��� N���� ��, �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N������ ������� �ִ�
	    // ���� ��, ��, �� �� �ϳ��� ��ĥ�ؾ���
	    // ������ ���� ��, ��, �ķ� ĥ�ϴ� ����� �־����� ��, �Ʒ� ��Ģ�� �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ�
	    // 1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� ��
	    // N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� ��
	    // 2~N-1�� ���� ���� ���� �� �� ���� ���� �޶�� ��
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