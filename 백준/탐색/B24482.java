package search;

import java.io.*;
import java.util.*;

public class B24482 {
	// 시작 노드 깊이 0으로 시작하여
	// 방문하는 노드의 깊이를 출력하는 프로그램
	// 각 정점의 부모노드를 기록해두고 부모 노드의 깉이 + 1로 설정함
	static int N, M, R, A, B, vertex, seq;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] depth, parent;
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
		depth = new int[N+1];
		parent = new int[N+1]; 
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			list[A].add(B);
			list[B].add(A);
		}
		
		for (int i = 1; i <= N; i++) Collections.sort(list[i]);
		
		dfs(R);
		
		for (int i = 1; i <= N; i++) {
			if (depth[i] == 0 && R != i) {
				bw.write(-1 + "\n");
			} else {
				bw.write(depth[i] + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int start) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		
		while (!stack.isEmpty()) {
			vertex = stack.pop();
			if (visited[vertex]) continue;
			visited[vertex] = true;
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

// 부모노드 체크하는 코드 만들어봐
