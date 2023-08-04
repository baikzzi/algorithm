package javaBasic;

import java.util.Scanner;

public class B2908 {
	public static void main(String[] args) {
		// 숫자를 오른쪽부터 거꾸로 읽는 상수의 대답 찾기
		// 거꾸로 읽었을 때 더 큰 수를 출력
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt(), b = in.nextInt();
		
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);

		String revstr1 = "";
		String revstr2 = "";
		
		for (int i = 2; i >= 0; i--) {
			revstr1 += str1.charAt(i);
			revstr2 += str2.charAt(i);
		}
		
		int reva = Integer.parseInt(revstr1);
		int revb = Integer.parseInt(revstr2);
		
		if (reva > revb) {
			System.out.println(reva);
		} else {
			System.out.println(revb);
		}
		
		in.close();
		
	}

}
