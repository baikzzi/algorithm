package greedy;

import java.util.Scanner;

public class B11399 {
	public static void main(String[] args) {
		// ATM 1대 밖에 없음
		// 1 ~ n 번까지 n명
		// 줄서는 순서에 따라 돈을 인출하는데 필요한 시간의 합이 달라짐
		// ex 5명
		// 3, 1, 4, 3, 2 분씩 걸림
		// 3, 4, 8, 11, 13분 기다림
		// 총합은 39분이 된다
		// 위에서 순서를 바꿔서
		// 1, 2, 3, 3, 4 분씩 걸리도록 바꾸면
		// 1, 3, 6, 9, 13 분 기다리고
		// 총합은 32분이 된다.
		// 빨리끝나는 사람이 먼저 와야함
		// 줄 선 사람 수 n과 각 사람이 인출 시간 p가 주어질때
		// 최소값 구하기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int totalTime = 0;
		for (int i = 0; i < n; i++) {
			totalTime += arr[i] * (n - i);		
		}

		System.out.println(totalTime);
		
		sc.close();
	}
}
