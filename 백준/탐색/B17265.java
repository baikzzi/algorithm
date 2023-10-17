package search;

import java.io.*;
import java.util.*;

public class B17265 {
	static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	static String[][] map;
	static int[] dx = {1, 0}, dy = {0, 1};
	public static void main(String[] args) throws IOException {
		// �����̳� ������ �б����� ���� ���� N*N ũ���� �ٵ��ǰ� ����
		// �� ��ϸ��� ���ڿ� �����ڰ� �����Ѵٰ� �����ؼ� ������ ���ڿ� �����ڸ� �� ��Ͽ� �־� �ٵ����� �������.
		// �б����� ������ ��ο��� ������ ���� ����� �ִ񰪰� �ּڰ��� ���Ϸ��� ��
		// (1,1)���� (N,N)���� �ִܰŸ��� �̵�
		// �׷��� ���� �����ʰ� �Ʒ��θ� �̵�
		// �ϱ� �� ������ ���� �����̸� ���� �ִ񰪰� �ּڰ��� ��������
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
