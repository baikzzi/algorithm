package search;

import java.io.*;
import java.util.*;

public class B2583 {
	static int M, N, K, cnt, size;
	static boolean[][] visited;
	static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
	static List<Integer>[] list;
	public static void main(String[] args) throws IOException {
		// 눈금의 간격이 1인 M * N 크기의 모눈종이
		// 눈금에 맞춰 K개의 직사각형을 그릴 떄
		// 직사각형의 내부를 제외한 나머지 부분이 K개의 분리된 영역으로 나누어짐
		// 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		visited = new boolean[M][N];
		list = new ArrayList[1];
		list[0] = new ArrayList<>();
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int y1 = Integer.parseInt(st.nextToken());
			int x1 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					visited[x][y] = true;
				}			
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					list[0].add(dfs(i,j));
					cnt++;
				}
			}
		}
		
		
		bw.write(cnt + "\n");
		Collections.sort(list[0]);
		for (int i : list[0]) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static int dfs(int x, int y) {
		size = 0;
		Stack<Integer> stackX = new Stack<>();
		Stack<Integer> stackY = new Stack<>();
		stackX.push(x);
		stackY.push(y);
		
		while(!stackX.isEmpty()) {
			x = stackX.pop();
			y = stackY.pop();
			if (visited[x][y]) continue;
			visited[x][y] = true;
			size++;
			
			for (int i = 0; i < 4; i++) {
				int newX = x + dx[i];
				int newY = y + dy[i];
				if (0 <= newX && newX < M && 0 <= newY && newY < N && !visited[newX][newY]) {
					stackX.push(newX);
					stackY.push(newY);
				}
			}
		}
		return size;
	}
}
