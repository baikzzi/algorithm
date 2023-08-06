package javaBasic;

import java.util.Scanner;

public class B2941 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		// 변경된 문자가 2~3이니
		// 문자열 처음부터 2~3길이만큼만 검사해서
		// 변경된 알파벳이면 카운트 늘리고 가 알파벳만큼 건너 뛰기
		// 아니면 카운트 늘리고 건너뛰기
		
		int len = str.length();
		int cnt = 0; // 크로아티아 알파벳 수
		
		for (int i = 0; i < len; i++) {
			cnt++;			
			for (int j = 1; j < 3; j++) {
				if (i+j < len && croatiaAlpha(arr, str.substring(i, i+j+1))) {
					// 문자열의 길이를 넘어가지 않으면서 크로아티아 알파벳인 경우
					// 크로아티아 알파벳 다음부터 검사 진행하도록 i 증가시켜줌
					i = i+j;
					break;
				}				
			}
		}

		System.out.println(cnt);
		
		
		in.close();
	}
	
	public static boolean croatiaAlpha(String[] arr, String str) {
		// 크로아티아 알파벳이면 참, 아니면 거짓
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				return true;
			}
		}
		return false;
		
	}
}
