package greedy;

import java.util.Scanner;

public class B11047 {
	public static void main(String[] args) {
		// n종류의 동전
		// 동전을 적절히 합쳐 k로 만들기
		// 이때 필요한 최소 동전개수 구하기
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		int[] coin = new int[n];
		
		for (int i = n-1; i >= 0; i--) {
			coin[i] = sc.nextInt();
		}
		
		int minCoin = 0;
		for (int i = 0; i < n; i++) {
			if (coin[i] > k) {
				continue;
			} else {
				int cnt = k / coin[i];
				k -= coin[i] * cnt;
				minCoin += cnt;
			}
		}
		
		System.out.println(minCoin);
		
		sc.close();
		
	}
}
