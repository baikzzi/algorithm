package search;

import java.io.*;
import java.util.*;

public class B24445 {
	static int N, M, R;
	static List<Integer> []list;
	static boolean[] visited;
	static int[] sequence;
	static int seq = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		list=new ArrayList[N+1];
		for(int i=1;i<=N;i++) list[i]=new ArrayList<>();
		visited = new boolean[N+1];
		sequence = new int[N+1];
		
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		for(int i = 1; i <= N; i++) {
			Collections.sort(list[i], Collections.reverseOrder());
		}
		bfs(R);	
		
		for (int i = 1; i <= N; i++) {
			bw.write(sequence[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void bfs(int start) {
		visited[start] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			sequence[vertex] = seq++;
			for (int i:list[vertex]) {
				if (visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		
	}
}
