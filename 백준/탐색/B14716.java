package search;

import java.io.*;
import java.util.*;

public class B14716 {
	static int M, N, cnt;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}, dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		// 현수막에서 1이 글자, 0은 글자가 아닌 부분
		// 글자인 부분 1의 상, 하, 좌, 우, 대각선으로 인접하여 연결되어 있으면 한 개의 글자
		// 글자의 개수가 몇 개인지 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 0) visited[i][j] = true;
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs (int x, int y) {
		Stack<Integer> stackX = new Stack<Integer>();
		Stack<Integer> stackY = new Stack<Integer>();
		
		stackX.push(x);
		stackY.push(y);
		
		while(!stackX.isEmpty()) {
			x = stackX.pop();
			y = stackY.pop();
			
			if (visited[x][y]) continue; // 없어도 될 것 같음
			visited[x][y] = true;
			
			for (int i = 0; i < 8; i++) {
				int newX = x + dx[i];
				int newY = y + dy[i];
				if (0 <= newX && newX < M && 0 <= newY && newY < N) {
					if (!visited[newX][newY] && arr[newX][newY] == 1) {
						stackX.push(newX);
						stackY.push(newY);
					}
				}
			}
			
		}
	}
}
