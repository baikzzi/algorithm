package search;

import java.io.*;
import java.util.*;

public class B17265 {
	static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	static String[][] map;
	static int[] dx = {1, 0}, dy = {0, 1};
	public static void main(String[] args) throws IOException {
		// 세현이네 집에서 학교까지 가는 길은 N*N 크기의 바둑판과 같음
		// 각 블록마다 숫자와 연산자가 존재한다고 생각해서 임의의 숫자와 연산자를 각 블록에 넣어 바둑판을 만들었다.
		// 학교에서 집까지 경로에서 만나는 연산 결과의 최댓값과 최솟값을 구하려고 함
		// (1,1)에서 (N,N)까지 최단거리로 이동
		// 그러기 위해 오른쪽과 아래로만 이동
		// 하교 중 교통사고를 당한 세현이를 위해 최댓값과 최솟값을 구해주자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		map = new String[N][N];
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = st.nextToken();
			}
		}
		dfs(0, 0, Integer.parseInt(map[0][0]), map[0][0], map);
			
		bw.write(max + " " + min + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	static void dfs(int x, int y, int ans, String str, String[][] map) {
		for (int i = 0; i < 2; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			if (newX < N && newY < N) {
				if (map[newX][newY].equals("+")) dfs(newX, newY, ans, "+", map);
				else if (map[newX][newY].equals("-")) dfs(newX, newY, ans, "-", map);
				else if (map[newX][newY].equals("*")) dfs(newX, newY, ans, "*", map);
				else {
					int result = 0;
					if (str.equals("+")) result = ans + Integer.parseInt(map[newX][newY]);
					else if (str.equals("-")) result = ans - Integer.parseInt(map[newX][newY]);
					else if (str.equals("*")) result = ans * Integer.parseInt(map[newX][newY]);
					
					if(newX == N-1 && newY == N-1) {
						max = Math.max(max, result);
						min = Math.min(min, result);
						return;
					}
					dfs(newX, newY, result, map[newX][newY], map);
				}				
			}
		}
	}
}
