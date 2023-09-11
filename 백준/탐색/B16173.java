package search;

import java.util.*;
import java.io.*;

public class B16173 {
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 1}, dy = {1, 0};
	
	public static void main(String[] args) throws IOException {
		// 새로운 점프 게임
		// 조건
		// 1. 가로 세로 칸수가 같은 정사각형의 구역 내부에서만 움직일 수 있다.
		// 범위 밖으로 나가면 게임 패배
		// 2. 출발점은 항상 (0,0)
		// 3. 이동 가능한 방향은 오른쪽과 아래뿐
		// 4. 가장 오른쪽 (n-1, n-1) 도착시 승리
		// 5. 현재 밟고 있는 칸에 쓰여있는 구만큼 한번에 이동할 수 있는 칸의 수
		// 더도 덜도 말고 써있는 만큼 움직임
		// 도달 가능하면 HaruHaru, 없으면 Hing 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
		System.out.println("Hing");
		
		br.close();
	}
	
	private static void dfs(int i, int j) {
		if (arr[i][j] == -1) {
			System.out.println("HaruHaru");
			System.exit(0);
		}
		
		for (int k = 0; k < 2; k++) {
			int x = i + dx[k] * arr[i][j];
			int y = j + dy[k] * arr[i][j];
			if (x >= N || y >= N || visited[x][y]) continue;
			
			visited[x][y] = true;
			dfs(x, y);
		}
	}
}
