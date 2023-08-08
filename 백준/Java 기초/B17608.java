package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B17608 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		int cnt = 0; // 맨 앞 막대기는 무조건 보임
		int maxNum = 0; // 현재까지 볼 수 있는 가장 긴 막대기
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			stack.push(num);
		}
		
		while (!stack.isEmpty()) {
			int compareNum = stack.pop();
			if (maxNum < compareNum) {
				cnt++;
				maxNum = compareNum;
			}
		}
		
		System.out.println(cnt);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		Stack<Integer> stack = new Stack<>();
//		
//		int cnt = 1; // 맨 앞 막대기는 무조건 보임
//		
//		for (int i = 0; i < n - 1; i++) {
//			int num = Integer.parseInt(br.readLine());
//			stack.push(num);
//		}
//		int maxNum = Integer.parseInt(br.readLine());
//				
//		while (!stack.isEmpty()) {
//			int compareNum = stack.pop();
//			if (maxNum < compareNum) {
//				cnt++;
//				maxNum = compareNum;
//			}
//		}
//		
//		System.out.println(cnt);
	}

}
