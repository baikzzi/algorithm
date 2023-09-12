package search;

import java.util.*;
import java.io.*;

public class B2606 {
	// 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때,
	// 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int computer = sc.nextInt();
		int connection = sc.nextInt();
		
		arr = new int[computer + 1][computer + 1];
		visited = new boolean[computer + 1];
		
		visited[0] = true; // 뒤에서 idx 1부터 시작하면 필요없을듯ㅌ
		visited[1] = true;
		
		for (int i = 0; i < connection; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
			if (a == 1) {
				stack.push(b);
			} else if (b == 1) {
				stack.push(a);
			}
		}
		
		while (!stack.isEmpty()) {
			int node = stack.pop();
			visited[node] = true;
			
			for (int i = 1; i <= computer; i++) {
				if (visited[i] == false && arr[node][i] == 1) {
					stack.push(i);
				}
			}
		}
		
		int cnt = 0;
		for (int i = 2; i <= computer; i++) {
			if (visited[i] == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
