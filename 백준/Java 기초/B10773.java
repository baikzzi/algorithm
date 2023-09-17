package javaBasic;

import java.io.*;
import java.util.*;

public class B10773 {
	public static void main(String[] args) throws IOException {
		// 장부 관리 중 돈을 잘못 부르는 사고치기 일쑤
		// 잘못된 수 브를 때마다 0을 외쳐, 가장 최근에 쓴 수를 지우게 시킴
		// 모든 수를 받아 적은 후 그 수의 합
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (k == 0) {
				stack.pop();
			} else {
				stack.push(k);
			}		
		}
		
		int ans = 0;
		
		while (!stack.isEmpty()) {
			ans += stack.pop();
		}
		
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
