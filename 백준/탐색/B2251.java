package search;

import java.io.*;
import java.util.*;

public class B2251 {
	public static class Water {
		int a, b, c;
		public Water(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	static int capaA, capaB, capaC;
	static boolean[][][] visited;
	static ArrayList<Integer> list;
	public static void main(String[] args) throws IOException {
		// 각 부피가 A, B, C(1~200)리터인 세개의 물통
		// 처음에는 앞에 두 물통이 비어있고 세번재 물통인 가득 차있다
		// 이제 어떤 물통에 들어있는 물을 다른 물통으로 쏟아 부을 수 있는데,
		// 이때 한 물통이 비거나, 다른 물통이 가득찰 때까지 부을 수 있다.
		// 이 과정에서 손솔율 넚다고 가정
		// 이 과정을 거치다보면 세번째 물통(용량 C)이 물의 양이 변할 수 있음
		// 첫번째 물통(용량 A)이 비어있을 때, 세번째 물통(용량 C)에 담겨있을 수 있는 물의 양으을 보두 구하시오
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		

		capaA = Integer.parseInt(st.nextToken());
		capaB = Integer.parseInt(st.nextToken());
		capaC = Integer.parseInt(st.nextToken());
		visited = new boolean[201][201][201];
		list = new ArrayList<>();

		bfs();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + " ");
		}
		bw.write("\n");

		bw.flush();
		bw.close();
		br.close();
	}
	static void bfs() {
		Queue<Water> queue = new LinkedList<Water>();
		queue.add(new Water(0, 0, capaC));
		
		while (!queue.isEmpty()) {
			Water water = queue.poll();
			int a = water.a;
			int b = water.b;
			int c = water.c;
			
			if (visited[a][b][c]) continue;
			visited[a][b][c] = true;
			
			if (a == 0) list.add(c);
			
			// 물 옮기기 (6가지 방법 * 2 (== 넘침 or 안넘침))
			// from A to B
			if (a + b >= capaB) { // 넘침
				queue.add(new Water(a-(capaB-b), capaB, c));
			} else { // 안넘침
				queue.add(new Water(0, a+b, c));
			}
			// from A to C
			if (a + c >= capaC) { // 넘침
				queue.add(new Water(a-(capaC-c), b, capaC));
			} else { // 안넘침
				queue.add(new Water(0, b, a+c));
			}
			// from B to A
			if (b + a >= capaA) { // 넘침
				queue.add(new Water(capaA, b-(capaA-a), c));
			} else { // 안넘침
				queue.add(new Water(b+a, 0, c));
			}
			// from B to C
			if (b + c >= capaC) { // 넘침
				queue.add(new Water(a, b-(capaC-c), capaC));
			} else { // 안넘침
				queue.add(new Water(a, 0, b+c));
			}
			// from C to A
			if (c + a >= capaA) { // 넘침
				queue.add(new Water(capaA, b, c-(capaA-a)));
			} else { // 안넘침
				queue.add(new Water(c+a, b, 0));
			}
			// from C to B
			if (c + b >= capaB) { // 넘침
				queue.add(new Water(a, capaB, c-(capaB-b)));
			} else { // 안넘침
				queue.add(new Water(a, c+b, 0));
			}
		}	
	}
}
