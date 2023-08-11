package javaBasic;

import java.util.Scanner;

public class B11949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(); // n은 학생 수, m은 카드 수
		int[] arr = new int[n];
		

		// n명이 각각 번호표 하나씩 갖고 있음
		// i번째 학생의 번호표에 적힌 수는 Ai이다.
		for (int i = 0; i < n; i++) { // 각 학생이 가지고 있는 번호표의 값
			arr[i] = sc.nextInt();
		}
		
		// 1~m까지의 m개의 카드가있다. 각 카드는 반드시 1부터 사용
		// k번째 카드는 k-1번 카드를 쓴 다음 쓴다.
		for (int i = 1; i <= m; i++) { // 1~m까지 카드
			for (int j = 0; j < n - 1; j++) { // 학생 순서대로 (마지막 학생은 카드를 그냥 버림)
				if (arr[j] % i > arr[j+1] % i) { //조건에 해당 시 스왑
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}			
		}
		// 규칙
		// 선생님이 1번 학생에게 (1~m 사이의) i번 카드를 준다.
		// 카드를 받은 j번 학생은 j+1번 학생에게 카드를 넘긴다.
		// Aj % i의 값(j번 학생의 번호표에 적힌 수 % 선생님이 주신 카드)이 Aj+1%i 의 값보다 크면 번호표 교환
		// 마지막 학생이 카드를 받으면 카드 버림 (처음부터 for문으로 돌리면서 위에 해당되면 스왑)

		for (int i = 0; i < n; i++) { // 다 끝나면 최종적으로 갖고있는 번호표 순서대로 출력
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
