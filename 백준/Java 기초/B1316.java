package javaBasic;

import java.util.Scanner;

public class B1316 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int cnt = 0; // 그룹단어 수
		
		for (int i = 0; i < n; i++) {
			String str = in.next();
			cnt += checkGroupWord(str); // 현재 단어가 그룹단어이면 1증가됨
			
		}
		
		System.out.println(cnt);
		
		
		in.close();
	}
	
	public static int checkGroupWord(String str) { // 그룹단어 체크 메소드 맞으면 1 아니면 0
		int len = str.length();
		boolean[] arr = new boolean[26];
		
		
		for (int i = 0; i < len; i++) {
			int idx = str.charAt(i) - 97;
			
			if (i == 0 || arr[idx] == false || (str.charAt(i - 1) == str.charAt(i))) { 
				// 단어의 첫문자, 처음 나온 문자, 이전 문자에 이어서 반복되는 문자는 통과
				arr[idx] = true;
			} else {
				return 0;
			}
		}
		return 1; // 조건을 다 통과했으니 그룹단어이다.
	}

}
