package search;

import java.io.*;
import java.util.*;

public class B3187 {
	static int R, C, kCnt, vCnt, k, v;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		// 양치기 꿍은 사람들이 더이상 믿지 않아 화나 복수심에 불타
		// 양들이 있는 울타리에 늑대들을 집어넣어 잡아먹게 했다
		// 같은 울타리 영약 안의 양들의 숫자가 늑대의 숫자보다 더 많을 경우 늑대가 잡아먹힌다.
		// 그 외의 경우에는 양이 잡아 먹힘
		// 양과 늑대는 대각선 이동 불가 (상, 하, 좌, 우만 가능)
		// 몇마리의 양과 늑대가 살아남는지 계산하여라
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new char[R][C];
		visited = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = str.charAt(j);
				if (arr[i][j] == '#') visited[i][j] = true;
			}
		}
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
				}
			}
		}
		bw.write(kCnt + " " + vCnt + "\n");
		
		bw.flush();
		bw.close();
		br.close();	
	}
	
	static void dfs (int x, int y) {
		k = 0;
		v = 0;
		Stack<Integer> stackX = new Stack<Integer>();
		Stack<Integer> stackY = new Stack<Integer>();
		stackX.push(x);
		stackY.push(y);
		
		while(!stackX.isEmpty()) {
			x = stackX.pop();
			y = stackY.pop();
			
			if (visited[x][y]) continue;
			visited[x][y] = true;
			
			if (arr[x][y] == 'k') k++;
			else if (arr[x][y] == 'v') v++;
			
			for (int i = 0; i < 4; i++) {
				int newX = x + dx[i];
				int newY = y + dy[i];
				if (0 <= newX && newX < R && 0 <= newY && newY < C) {
					if (!visited[newX][newY]) {
						stackX.push(newX);
						stackY.push(newY);
					}
				}
			}
		}
		if (k > v) kCnt += k; // 양이 더 많으면 양만 살아남고
		else vCnt += v; // 늑대가 더 많으면 늑대만 살아남
		
	}
}
