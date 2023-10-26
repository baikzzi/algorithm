package bruteForce;

import java.io.*;
import java.util.*;

public class B1018 {
	static int N, M, minCnt = 32;
	static String str;
	static char[][] arr;
	public static void main(String[] args) throws IOException {
		// 주어진 N*M 보드에서 8*8의 체스판을 고를 때 다시 칠하는 횟수의 최소를 구하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				minCnt = Math.min(minCnt, cntVerW(i, j));
				minCnt = Math.min(minCnt, cntVerB(i, j));
			}
		}
		bw.write(minCnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	static int cntVerW(int x, int y) { // W로 시작
		int cnt = 0;
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if ((i + j) % 2 == 0 && arr[i][j] != 'W') cnt++;
				else if ((i + j) % 2 == 1 && arr[i][j] != 'B') cnt++;
			}
		}
		return cnt;
	}
	static int cntVerB(int x, int y) { // B로 시작
		int cnt = 0;
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if ((i + j) % 2 == 0 && arr[i][j] != 'B') cnt++;
				else if ((i + j) % 2 == 1 && arr[i][j] != 'W') cnt++;
			}
		}
		return cnt;
	}
}
