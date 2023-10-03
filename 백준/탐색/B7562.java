package search;

import java.io.*;
import java.util.*;

public class B7562 {
	static int TEST_CASE, SIZE, x1, y1, x2, y2;
	static int[][] chess;
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2}, dy = {-1, 1, -2, 2, -2, 2, -1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		TEST_CASE = Integer.parseInt(br.readLine());
		for (int i = 0; i < TEST_CASE; i++) {
			SIZE = Integer.parseInt(br.readLine());
			chess = new int[SIZE][SIZE];
			
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			if (x1 == x2 && y1 == y2) bw.write(0 + "\n");
			else {
				bfs(x1, y1);
				bw.write(chess[x2][y2] + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static void bfs(int x, int y) {
		// 배열 (체스판) 시작점 (x,y) 0으로 시작해서
		// 나이트가 갈수있는 곳이 0이면 현재 좌표 + 1하고 큐에 넣에 bfs 진행
		Queue<Integer> queueX = new LinkedList<>();
		Queue<Integer> queueY = new LinkedList<>();
		queueX.add(x);
		queueY.add(y);
		
		while(!queueX.isEmpty()) {
			x = queueX.poll();
			y = queueY.poll();
			if (x == x2 && y == y2) break;
			
			for (int i = 0; i < 8; i++) {
				int newX = x + dx[i];
				int newY = y + dy[i];
				if (0 <= newX && newX < SIZE && 0 <= newY && newY < SIZE) {
					if (chess[newX][newY] != 0) continue;
					chess[newX][newY] = chess[x][y] + 1;
					queueX.add(newX);
					queueY.add(newY);
				}
			}
		}
	}
}
