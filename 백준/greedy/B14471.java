package greedy;

import java.util.Scanner;

public class B14471 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 각 포인트 카드에 2N개의 도장 칸이 있음
		// 한칸에 당첨 or 꽝 한번
		// 2N개 중 N개 이상 칸에 당첨 도장 찍힌 카드는 경품과 교환 가능
		// 한 칸에 찍힌 도장을 1엔을 내고 다른 도장으로 바꿀 수 있음
		
		// 2N칸을 다 채운 카드 M장을 가지고 있음
		// i번째 카드에는 Ai개의 당첨, Bi개의 꽝 도장
		// M-1개 이상의 경품을 가지려고 할때 이에 필요한 최소비용
			
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[] arr = new int[m];
		
		for (int i = 0; i < m; i++) {
				arr[i] = sc.nextInt(); // 당첨 Ai개
				sc.nextInt(); // 꽝 Bi개 (안쓸거)
		}
		
		// 통과한거 높은 순으로 정렬		
		for (int i = 0; i < m; i++) {
			for (int j = i; j < m - 1; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		int moreNeed = m-1;
		int price = 0;
		
		for (int i = 0; i < m; i++) {
			if (arr[i] >= n) {
				moreNeed--;
			} else {
				price += n - arr[i];
				moreNeed--;
				
			}
			if (moreNeed == 0) {
				break;
			}
		}
		
		System.out.println(price);
		
		// 통과된거 패스하면서 필요한 남은 통과카드--;
		// 통과 못한 것 나오는 것부터 필요한 남은 통과카드 만큼
		// n과의 차이를 비용변수에 더함
		
		
		sc.close();
	}

}
