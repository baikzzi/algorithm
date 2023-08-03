package javaBasic;

import java.util.Scanner;

public class B11654 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ac = in.next().charAt(0);
		// charAt()의 결과인 char를 int형으로 변환하려면 아스키코드로 변환된다.
		
		System.out.println(ac);
		
		in.close();
		
	}
}
