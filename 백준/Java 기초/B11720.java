package javaBasic;

import java.util.Scanner;

public class B11720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String str = in.next();
		int sum = 0;
		
		//  charAt() 은 해당 문자의 아스키코드 값을 반환하므로
		// 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다
		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';			
		}
		
		System.out.println(sum);
		
		
		in.close();
	}
}
