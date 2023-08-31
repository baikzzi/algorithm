package greedy;

import java.util.*;

public class B20115 {
	public static void main(String[] args) {
		// 에너지 드링크 조합
		// 1. 서로다른 드링크 두개 고르기
		// 2. 한쪽에서 다른쪽으로 모두 붓는데 무조건 절반은 흘림
		// 3. 다 붓고 빈 에너지 드링크 버림
		// 4. 1~3 과정을 하나만 남을때까지 반복
		// a + (b/2)
		// 드링크 양 최대로

		// 2 3 6 9 10
		// 낮은 순으로 정렬 후 제일 큰거 제외 다 더해서 반으로 나누어서 제일 큰 것에 추가
		
		
		//1 9 27 39 45 65 77 80 100 495
		// (443 / 2) + 495 = 716.5
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		double ans = 0;
		for (int i = 0; i < n - 1; i++) {
			ans += arr[i];
		}
		ans /= 2;
		ans += arr[n-1];
		
		System.out.println(ans);
		
		sc.close();
	
	}
}
