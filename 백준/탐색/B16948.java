package search;

import java.io.*;
import java.util.*;

public class B16948 {
	static int N, r1, c1, r2, c2;
	static int[] dr = {-2, -2, 0, 0, 2, 2}, dc = {-1, 1, -2, 2, -1, 1};
	static int[][] chess;
	public static void main(String[] args) throws IOException {
		// 체스에서 사용할 "데스 나이트"를 만듦
		// (r,c)에서 (r-2, c-1), (r-2, c+1), (r, c-2), (r, c+2), (r+2, c-1), (r+2, c+1)로 이동 가능
		// (r1, c1)에서 (r2, c2)로 이동하는 최소 이동 횟수를 구해보자
		// 체스판의 행과 열은 0번부터 시작한다.
		// 말은 체스판 밖으로 벗어날 수 없다.
		
		// 너비우선 탐색으로 깊이 하나씩 돌때마다 카운트 올리고 r2,c2 나오면 끝
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		
		chess = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				chess[i][j] = -1;
			}
		}
		chess[r1][c1] = 0; // 시작점은 0
		
		bfs(r1, c1);
		bw.write(chess[r2][c2] + "\n"); // 방문 했으면 최소이동횟수가, 못했으면 -1이 있음
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void bfs(int r1, int c1) {
		Queue<Integer> queueR = new LinkedList<>();
		Queue<Integer> queueC = new LinkedList<>();
		queueR.add(r1);
		queueC.add(c1);
		
		while(!queueR.isEmpty()) {
			// r2,c2면 종료
			// chess[a][b]가 -1이 아니면 넣지 않고 넘어감 (이미 최단거리로 방문);
			int r = queueR.poll(), c = queueC.poll();
			for (int i = 0; i < 6; i++) {
				int newR = r + dr[i];
				int newC = c + dc[i];
				if (0 <= newR && newR < N && 0 <= newC && newC < N) { // 말이 갈 수 있는곳인가
					if (chess[newR][newC] != -1) continue; // 이전에 방문한 적이 있으면 그것이 최단거리니 방문안함
					chess[newR][newC] = chess[r][c] + 1;
					queueR.add(newR);
					queueC.add(newC);
				}
			}
			if (chess[r2][c2] != -1) { // 목적지 (r2,c2)에 방문했으면 더이상 탐색 X
				break;
			}
		}
	}
}
