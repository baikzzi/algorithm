package javaBasic;

import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		int len = str.length();
		
		int cnt = 0; 
		// 처음부터 공백이면 넘어가고 공백아니고 처음만나는 문자에서 +1
		
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') { // 공백이면 넘어가고
				continue;
			} else if (i == len - 1 || str.charAt(i + 1) == ' ') { // 이미 공백은 아니고 다음이 공백이거나 문장의 끝이면 단어수 증가 
				cnt++;		
			}
		}
		
		System.out.println(cnt);
		
		in.close();
	}

}
