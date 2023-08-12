package javaBasic;

import java.util.Scanner;

public class B2863 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][2];
				
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int maxRotation = 0; // 1번 회전과 0번 회전의 값이 같으면 작은 0을 출력
		double maxResult = arr[0][0] / arr[1][0] + arr[0][1] / arr[1][1];;
		
		for (int i = 1; i < 4; i++) {
			// 돌리는 코드
			double temp = arr[0][0];
			arr[0][0] = arr[1][0];
			arr[1][0] = arr[1][1];
			arr[1][1] = arr[0][1];
			arr[0][1] = temp;
			
			double result = arr[0][0] / arr[1][0] + arr[0][1] / arr[1][1];
			
			if (maxResult < result) {
				maxResult = result;
				maxRotation = i;
			}			
		}
		
		System.out.println(maxRotation);
		
		sc.close();
	}

}
