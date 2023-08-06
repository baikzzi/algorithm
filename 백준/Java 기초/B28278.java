package javaBasic;

import java.util.Stack;
import java.util.Scanner;

public class B28278 {	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack();
		
		int n = in.nextInt();
		
		while(n-- > 0) {
			int method = in.nextInt();
			
			if (method == 1) { // push
				stack.push(in.nextInt());
			} else if (method == 2) { // pop
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");				
			} else if (method == 3) { // 원소 개수
				sb.append(stack.size()).append("\n");
			} else if (method == 4) { // isEmpty
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");
			} else { // peek
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
			}
		}
		System.out.println(sb);
		
		in.close();
		}
	
}