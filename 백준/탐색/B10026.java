package search;

import java.io.*;
//import java.util.*;

public class B10026 {
	static int N, cnt;
	static String str;
	static char[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		// 적록색약은 빨간색과 초록색의 차이를 느끼지 못함
		// N*N크기의 RGB중 하나로 색칠한 그림이 있음
		// 상하좌우로 연결되어있으면 하나의 구역을 간주
		// 그림이 몇개의 구역으로 구성되어있는지 확인하는 프로그램
		// 적록색약이 아닌사람이 본 구역과 적록색약인 사람이 본 구역의 수를 출력
		
		// 힌트 : 탐색 시 재귀호추링 아닌 Queue or Stack 사용시 메모리 초과 발생
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					cnt++;
					dfs(i, j);
//					bfs(i, j, map[i][j]);
				}
			}
		}
		bw.write(cnt + " ");
		cnt = 0;
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 'G') map[i][j] = 'R';
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					cnt++;
					dfs(i, j);
//					bfs(i, j, map[i][j]);
				}
			}
		}
		
		bw.write(cnt + "\n");
			
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void dfs(int x, int y){
        visited[x][y] = true;
        char tmp_char = map[x][y]; // R
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (0 <= newX && newX < N && 0 <= newY && newY < N) {
            	if (!visited[newX][newY] && map[newX][newY] == tmp_char) {
            		dfs(newX, newY);
            	}
            }
        }
    }
//	static void bfs(int x, int y, char cha) {
//		Queue<Integer> queueX = new LinkedList<>();
//		Queue<Integer> queueY = new LinkedList<>();
//		queueX.add(x);
//		queueY.add(y);
//		
//		while(!queueX.isEmpty()) {
//			x = queueX.poll();
//			y = queueY.poll();
//			
//			visited[x][y] = true;
//			
//			for (int i = 0; i < 4; i++) {
//				int newX = x + dx[i];
//				int newY = y + dy[i];
//				
//				if (0 <= newX && newX < N && 0 <= newY && newY < N && map[newX][newY] == cha && !visited[newX][newY]) {
//					queueX.add(newX);
//					queueY.add(newY);
//				}
//			}
//		}
//	}

}
