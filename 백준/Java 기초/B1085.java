package javaBasic;

import java.util.Scanner;

public class B1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
		int closest = 1000;
		
		closest = Math.min(w-x, x);
		closest = Math.min(closest, Math.min(h-y, y));
		
		
		// w, h에서 x, y를 빼거나 x,y에서 1을 뺀 값 중 min을 출력
		
		System.out.println(closest);
		
		
		
	}

}
