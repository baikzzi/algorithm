package search;

import java.io.*;
import java.util.*;

public class B11123 {
	static int TESTCASE, H, W, cnt;
	static char[][] greed;
	static boolean[][] visited;
	static int[] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		TESTCASE = Integer.parseInt(br.readLine());
		
		while (TESTCASE-- > 0) {
			cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			
			greed = new char[H][W];
			visited = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				String str = br.readLine();
				for (int j = 0; j < W; j++) {
					greed[i][j] = str.charAt(j);
				}
			}
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (greed[i][j] == '#' && visited[i][j] == false) {
						cnt++;
						dfs(i, j);
					}
				}
			}			
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int i, int j) {
		Stack<Integer> stackX = new Stack<>();
		Stack<Integer> stackY = new Stack<>();
		
		stackX.push(i);
		stackY.push(j);
		
		while (!stackX.isEmpty()) {
			int x = stackX.pop();
			int y = stackY.pop();
			if (visited[x][y] == true || greed[x][y] == '.') continue;
			visited[x][y] = true;
			for (int k = 0; k < 4; k++) {
				int newX = x + dx[k];
				int newY = y + dy[k];
				if (newX >= 0 && newX < H && newY >= 0 && newY < W) {
					stackX.push(newX);
					stackY.push(newY);
				}
			}
		}
	}
}
