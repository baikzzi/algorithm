package greedy;

import java.util.Scanner;

public class B11399 {
	public static void main(String[] args) {
		// ATM 1�� �ۿ� ����
		// 1 ~ n ������ n��
		// �ټ��� ������ ���� ���� �����ϴµ� �ʿ��� �ð��� ���� �޶���
		// ex 5��
		// 3, 1, 4, 3, 2 �о� �ɸ�
		// 3, 4, 8, 11, 13�� ��ٸ�
		// ������ 39���� �ȴ�
		// ������ ������ �ٲ㼭
		// 1, 2, 3, 3, 4 �о� �ɸ����� �ٲٸ�
		// 1, 3, 6, 9, 13 �� ��ٸ���
		// ������ 32���� �ȴ�.
		// ���������� ����� ���� �;���
		// �� �� ��� �� n�� �� ����� ���� �ð� p�� �־�����
		// �ּҰ� ���ϱ�
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
