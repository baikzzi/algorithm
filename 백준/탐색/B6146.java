package search;

import java.io.*;
import java.util.*;

public class B6146 {
	static int goalX, goalY, poolCnt;
	static int[][] distance;
	static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// 키파는 신아를 만나러 (0,0) 집에서 출발, (Ai, Bi)에 위치한 N(1~1000)개의 웅덩이 (i는 -500에서 500)가 있는 것을 보고 놀람
		// 눈이 좋아 웅덩이를 모두 볼 수 있음
		// 키파가 상하좌우로 이동할 수 있다면 웅덩이 밟지 않고 신아에게 갈 수 있는 최소거리는? >> BFS
		
		// 음수좌표가 있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		goalX = Integer.parseInt(st.nextToken()) + 500;
		goalY = Integer.parseInt(st.nextToken()) + 500;
		poolCnt = Integer.parseInt(st.nextToken());
		distance = new int[1001][1001];
		
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				distance[i][j] = -1;
			}
		}
		while(poolCnt-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) + 500;
			int y = Integer.parseInt(st.nextToken()) + 500;
			distance[x][y] = 0;
		}
		distance[500][500] = 0;
		bfs(500, 500);
		bw.write(distance[goalX][goalY] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void bfs(int x, int y) {
		Queue<Integer> queueX = new LinkedList<>();
		Queue<Integer> queueY = new LinkedList<>();
		queueX.add(x);
		queueY.add(y);
		
		while(!queueX.isEmpty()) {
			x = queueX.poll();
			y = queueY.poll();
			
			for (int i = 0; i < 4; i++) {
				int newX = x + dx[i];
				int newY = y + dy[i];
				if (0 <= newX && newX < 1001 && 0 <= newY && newY < 1001) {
					if (distance[newX][newY] != -1) continue; 
					distance[newX][newY] = distance[x][y] + 1;
					if (newX == goalX && newY == goalY) break;
					queueX.add(newX);
					queueY.add(newY);
				}
			}
		}
	}
}
