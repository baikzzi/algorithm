package search;

import java.io.*;
import java.util.*;

public class B21736 {
	static char[][] campus;
	static boolean[][] visited;
	static int n, m, startX, startY, cnt;
	static int[] dx = {-1, 0, 1, 0}; // �������
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		// 20202 ������ �峻�� ������
		// ���� �������� �б��� �ƴ� ģ���� ����
		// ��� ������ �ϰԵǾ� �����̴� ķ�۽� ������ ģ������ ����
		// n * m ũ���� ķ�۽�
		// �����¿�� �̵�
		// �����̰� ���� �� �ִ� ����� ���� ���
		// o = �����, x = ��, i = ������, p = �ƴ� ���
		// i�� �ѹ��� �־����� �����
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
