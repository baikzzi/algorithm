package search;

import java.io.*;
import java.util.*;

public class B24480 {
	static int N, M, R, v1, v2, seq;
	static List<Integer>[] list;
	static boolean[] visited;
	static int[] order;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();
		visited = new boolean[N+1];
		order = new int[N+1];
		
		
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			v1 = Integer.parseInt(st.nextToken());
			v2 = Integer.parseInt(st.nextToken());
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for (int i = 1; i <= N; i++) Collections.sort(list[i]);
		
		dfs(R);
		
		for (int i = 1; i <= N; i++) bw.write(order[i] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int start) {
//		visited[start] = true;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			int vertex = stack.pop();
			if (visited[vertex]) continue;
			visited[vertex] = true;
			order[vertex] = ++seq;
			for (int i : list[vertex]) {
				if (visited[i] == false) {
					stack.push(i);
				}
			}
		}
	}
}
