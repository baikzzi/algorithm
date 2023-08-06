package javaBasic;

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int cnt = n;
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (num == 1) {
				cnt--;
				continue;
			} else {
				for (int j = 2; j < num; j++) {
					if (num%j == 0) {
						cnt--;
						break;
					}
				}
			}
			
		}
		System.out.println(cnt);
		
		in.close();
	}

}
