package greedy;

import java.util.Scanner;

public class B14469 {
	public static void main(String[] args) {
		// 농장에 소가 마구잡이로 건너다니는 것에 진절머리가 남
		// 농장 둘레에 매우 큰 울타리를 짓기로 함
		// 이러면 소가 들어올일이 거의 없음
		// 주변 소들이 분개함
		// 친구네 집에 못놀러가고, 매년 참가하던 국제 젖짜기 올림피아드에도 올해 참가 못하게 되었음
		// 방문 가능한 소도 있지만 존의 농장에는 문이 하나, 감시관의 검문 필요
		// 여러마리가 한번에 들어가려고 하면 줄이 길어짐
		// n마리의 소가 방문하러 옴, 소가 도착한 시간과 검문 받는데 걸리는 시간은  소마다 다름
		// 같은수도 있음
		// 두 소가 동시 검문 불가
		// 모든 소가 농장에 입장하려면 얼마나 걸리나
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i][0] > arr[j][0]) {
					int temp1 = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp1;
					
					int temp2 = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp2;
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			if (ans < arr[i][0]) {
				ans = arr[i][0] + arr[i][1];
			} else {
				ans += arr[i][1];
			}		
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
