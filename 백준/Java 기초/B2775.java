package javaBasic;

import java.util.Scanner;

public class B2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 아파트 거주 조건 
		//" a층의 b호에 살려면 자신의 아래층의 1호부터 b호까지 사람들의 수 합만큼 데려와 살아야함"
		// 비어있는 집 없고 모든 집이 이 계약 조건 만족
		// 주어지는 k층 n호에는 몇명이 살고 있는지 출력
		// 아파트는 0층부터 있고 각 층에는 1호부터 있으며 0층의 i호에는 i명이 산다.
		
		int n = sc.nextInt(); // testCase 수
		
		int[][] arr;
		
		for (int i = 0; i < n; i++) {
			int floor = sc.nextInt(), ho = sc.nextInt();
			arr = new int[floor + 1][ho + 1];
			
			for (int j = 1; j <= ho; j++) {
				arr[0][j] = j;
			}
			
			for (int j = 1; j <= floor; j++) {
				for (int k = 1; k <= ho; k++) {
					arr[j][k] = arr[j-1][k] + arr[j][k-1];
				}
			}
			
			System.out.println(arr[floor][ho]);
		}
		sc.close();
	}

}
