package search;

import java.io.*;
import java.util.*;

public class B1260 {
	static int[][] arr;
	static int n, m, v;
	static boolean[] visitedDFS;
	static boolean[] visitedBFS;
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());

//		n = Integer.parseInt(st.nextToken());
//		m = Integer.parseInt(st.nextToken());
//		v = Integer.parseInt(st.nextToken());

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		arr = new int[n+1][n+1];
		visitedDFS = new boolean[n+1];
		visitedBFS = new boolean[n+1];
		
		visitedDFS[0] = true;
		visitedBFS[0] = true;
		
		for (int k = 0; k < m; k++) {
//			st = new StringTokenizer(br.readLine());
//			int i = Integer.parseInt(st.nextToken());
//			int j = Integer.parseInt(st.nextToken());
			
			int i = sc.nextInt(), j = sc.nextInt();

			arr[i][j] = 1;
			arr[j][i] = 1;
		}
		String str = dfs();
		bw.write(str + "\n");
		str = bfs();
		bw.write(str + "\n");
				
		bw.flush();
		bw.close();
//		br.close();
	}
	static String dfs() {
		String str = "";
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		while (!stack.isEmpty()) {
			int vertex = stack.pop();
			if (visitedDFS[vertex] == true) {
				continue;
			}
			visitedDFS[vertex] = true;
			str += vertex + " ";
			for (int i = n; i >= 1; i--) {
				if (visitedDFS[i] == false && arr[vertex][i] == 1) {
					stack.push(i);
				}
			}
		}
		return str;
	}
	
	static String bfs() {
		String str = "";
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			if (visitedBFS[vertex] == true) {
				continue;
			}
			visitedBFS[vertex] = true;
			str += vertex + " ";
			for (int i = 1; i <= n; i++) {
				if (visitedBFS[i] == false && arr[vertex][i] == 1) {
					queue.add(i);
				}
			}
		}
		return str;
	}
}
