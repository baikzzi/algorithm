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
		// �� ���ǰ� A, B, C(1~200)������ ������ ����
		// ó������ �տ� �� ������ ����ְ� ������ ������ ���� ���ִ�
		// ���� � ���뿡 ����ִ� ���� �ٸ� �������� ��� ���� �� �ִµ�,
		// �̶� �� ������ ��ų�, �ٸ� ������ ������ ������ ���� �� �ִ�.
		// �� �������� �ռ��� ���ٰ� ����
		// �� ������ ��ġ�ٺ��� ����° ����(�뷮 C)�� ���� ���� ���� �� ����
		// ù��° ����(�뷮 A)�� ������� ��, ����° ����(�뷮 C)�� ������� �� �ִ� ���� ������ ���� ���Ͻÿ�
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
			
			// �� �ű�� (6���� ��� * 2 (== ��ħ or �ȳ�ħ))
			// from A to B
			if (a + b >= capaB) { // ��ħ
				queue.add(new Water(a-(capaB-b), capaB, c));
			} else { // �ȳ�ħ
				queue.add(new Water(0, a+b, c));
			}
			// from A to C
			if (a + c >= capaC) { // ��ħ
				queue.add(new Water(a-(capaC-c), b, capaC));
			} else { // �ȳ�ħ
				queue.add(new Water(0, b, a+c));
			}
			// from B to A
			if (b + a >= capaA) { // ��ħ
				queue.add(new Water(capaA, b-(capaA-a), c));
			} else { // �ȳ�ħ
				queue.add(new Water(b+a, 0, c));
			}
			// from B to C
			if (b + c >= capaC) { // ��ħ
				queue.add(new Water(a, b-(capaC-c), capaC));
			} else { // �ȳ�ħ
				queue.add(new Water(a, 0, b+c));
			}
			// from C to A
			if (c + a >= capaA) { // ��ħ
				queue.add(new Water(capaA, b, c-(capaA-a)));
			} else { // �ȳ�ħ
				queue.add(new Water(c+a, b, 0));
			}
			// from C to B
			if (c + b >= capaB) { // ��ħ
				queue.add(new Water(a, capaB, c-(capaB-b)));
			} else { // �ȳ�ħ
				queue.add(new Water(a, c+b, 0));
			}
		}	
	}
}
