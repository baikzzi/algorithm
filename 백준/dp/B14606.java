package dp;

import java.util.Scanner;

public class B14606 {
	public static void main(String[] args) {
		// 갑은 피자 n판 시킴
		// 식탁 위에 피자 n판이 탑처럼 쌓여 있음
		// 높이가 n인 피자탁을 높이가 1인 피자탑으로 분리시켜야 함

		// 식탁 위 피자탑들 중 하나 고름
		// 고른 피자탑을 두개로 분리
		// 분리된 두 피자탑의 높이의 곱만큼 즐거움을 느낌
		// ex) 높이 A >> 높이 B와 C로 분리 >>> B*C 만큼의 즐거움을 느낌
		// 높이가 1인 피자탑은 분리시키지 않음
		// n이 주어질 때 즐거움의 총합이 최대가 되도록
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = i - 1 + arr[i-1];
		}
		
		System.out.println(arr[n]);
		
		sc.close();
	}

}
