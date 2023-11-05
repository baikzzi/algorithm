package search;

import java.io.*;
import java.util.*;

public class B4963 {
	static int N, M, cnt;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}, dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0) break;

			cnt = 0;
			map = new int[N][M];
			visited = new boolean[N][M];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						cnt++;
						bfs(i, j);
					}
				}
			}
			bw.write(cnt + "\n");			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void bfs(int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 8; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			if (0 <= newX && newX < N && 0 <= newY && newY < M && map[newX][newY] == 1 && !visited[newX][newY]) {
				bfs(newX, newY);
			}
		}
	}
}
