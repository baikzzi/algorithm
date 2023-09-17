package dp;

import java.io.*;
import java.util.*;

public class B11048 {
	public static void main(String[] args) throws IOException {
		// n * m 미로에 갇혀있다.
		// 각 방에는 사탕이 놓여져 있다.
		// 가장 왼쪽 윗방은 (1, 1)이고, 오른쪽, 아래쪽, 오른쪽 아래 대각선 이렇게 이동 가능
		// (n,m)으로 이동할 때 가져올 수 있는 사탕 개수의 최대 값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] maxCandy = new int[n][m];
		maxCandy[0][0] = arr[0][0];
		
		for (int i = 1; i < n; i++) {
			maxCandy[i][0] = maxCandy[i-1][0] + arr[i][0];
		}
		for (int i = 1; i < m; i++) {
			maxCandy[0][i] = maxCandy[0][i-1] + arr[0][i];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				maxCandy[i][j] = Math.max(maxCandy[i-1][j-1], Math.max(maxCandy[i-1][j], maxCandy[i][j-1])) + arr[i][j];
			}
		}
		
		bw.write(maxCandy[n-1][m-1] + "\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
