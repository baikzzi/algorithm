package javaBasic;

import java.util.Scanner;

public class B11718 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) { // 다음이 있으면
			System.out.println(in.nextLine()); // 한줄 다 출력
		}
		
		in.close();
		
	}

}
