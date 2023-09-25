package search;

import java.io.*;
import java.util.*;

public class B24484 {
	static int N, M, R, V1, V2, seq, dep, vertex;
	static long ans;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static long[] order, depth;
	static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();
		visited = new boolean[N+1];
		order = new long[N+1];
		depth = new long[N+1];
		parent = new int[N+1];
		for (int i = 1; i <= N; i++) depth[i] = -1;
		
		while (M-- >  0) {
			st = new StringTokenizer(br.readLine());
			V1 = Integer.parseInt(st.nextToken());
			V2 = Integer.parseInt(st.nextToken());
			
			list[V1].add(V2);
			list[V2].add(V1);
		}
		
		for (int i = 1; i <= N; i++) Collections.sort(list[i]);
		
//		dfs(R, dep);		
		dfs(R);
		
		for (int i = 1; i <= N; i++) {
			if (visited[i])	ans += order[i] * depth[i];
		}
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
//	static void dfs(int vertex, int dep) {
//		visited[vertex] = true;
//		depth[vertex] = dep;
//		ans += ++seq * dep;
//		for (int v : list[vertex]) {
//			if (!visited[v]) dfs(v, ++dep);
//		}
//	}
	
	static void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		depth[start] = dep;
		
		while (!stack.isEmpty()) {
			vertex = stack.pop();
			if (visited[vertex]) continue;
			visited[vertex] = true;
			order[vertex] = ++seq;
			if (vertex != R) depth[vertex] = depth[parent[vertex]] + 1;
			for (int v : list[vertex]) {
				if (!visited[v]) {
					parent[v] = vertex;
					stack.push(v);
				}
			}
		}
	}
}
