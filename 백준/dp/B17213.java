package dp;

import java.io.*;

public class B17213 {
	public static void main(String[] args) throws IOException {
		// 민건이네 과일 농장 n가지 종류의 과일을 재배
		// 민건이에게 앙심을 품은 지환이가 과일을 훔치기로 다짐함
		// 완벽 범죄를 위해 처음 생각한 개수 만큼만 훔치려 함
		// 이때 지황이가 훔칠 수 있는 경우의 수
		// 단, 모든 종류의 과일을 적어도 1개씩은 훔침
		// n = 과일의 종류, m = 훔치려는 과일의 개수
		// 1 <= n <= 10, n <= m <= 30
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][m + 1];
		
		if (n == 1) {
			bw.write(1 + "\n");
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (i == 1 || i >= j) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i][j-1] + arr[i-1][j-1];
					}
				}
			}
			bw.write(arr[n][m] + "\n");
		}
				
		bw.flush();
		bw.close();
		br.close();
	}
}
