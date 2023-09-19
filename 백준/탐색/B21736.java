package search;

import java.io.*;
import java.util.*;

public class B21736 {
	static char[][] campus;
	static boolean[][] visited;
	static int n, m, startX, startY, cnt;
	static int[] dx = {-1, 0, 1, 0}; // 상우하좌
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		// 20202 입학한 헌내기 도연이
		// 비대면 수업으로 학교에 아는 친구가 없다
		// 대면 수업을 하게되어 도연이는 캠퍼스 사람들과 친해지고 싶음
		// n * m 크기의 캠퍼스
		// 상하좌우로 이동
		// 도연이가 만날 수 있는 사람의 수를 출력
		// o = 빈공간, x = 벽, i = 도연이, p = 아는 사람
		// i는 한번만 주어짐이 보장됨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		campus = new char[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				campus[i][j] = str.charAt(j);
				if (campus[i][j] == 'X') {
					visited[i][j] = true;
				} else if (campus[i][j] == 'I') {
					startX = i;
					startY = j;
				}
			}
		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(visited[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		dfs(startX, startY);
		if (cnt == 0) bw.write("TT\n");
		else bw.write(cnt + "\n");
		
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
			if (visited[x][y] == true || campus[x][y] == 'X') continue;
			visited[x][y] = true;
			if (campus[x][y] == 'P') cnt++;
			for (int k = 0; k < 4; k++) {
				int newX = x + dx[k];
				int newY = y + dy[k];
				if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
					stackX.push(newX);
					stackY.push(newY);
				}
			}
		}
	}
}
