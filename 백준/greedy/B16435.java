package greedy;

import java.util.Scanner;

public class B16435 {
	public static void main(String[] args) {
		// 스네이크버드는 과일 먹으면 길이가 1 늘어남
		// 과일들은 지상으로부터 일정 높이를 두고 떨어져 있으며
		// i번째 (1~n사이) 과일의 높이는 hi이다.
		// 스네이크버드는 자신의 길이보다 작거나 같은 높이에 있는 과일들을 먹을 수 있다.
		// 스네이크버드의 처음 길이가 l 일때 과일들을 먹어 늘릴 수 있는 최대 길이를 구하여라
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), l = sc.nextInt();
		
		int[] fruit = new int[n];
		
		for (int i = 0; i < n; i++) {
			fruit[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (fruit[i] > fruit[j]) {
					int temp = fruit[i];
					fruit[i] = fruit[j];
					fruit[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (fruit[i] <= l) {
				l++;
			} else {
				break;
			}
		}
		
		System.out.println(l);
		
		
		sc.close();
	}

}
