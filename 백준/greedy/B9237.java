package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B9237 {
	public static void main(String[] args) {
		// 마당에 심기 위한 n개의 나무 묘목을 구힙함
		// 묘목 하나 심는데 1일 걸림
		// 심고난 후 다 자라는데 얼마나 걸리는지 정확히 알고 있음
		// 모든 나무가 자란 후 이장님을 초대해 자랑하려 하는데
		// 다 자란 다음날 이장님을 초대할 것
		// 나무 심는 순서를 신중하게 골라 이장님을 최대한 빨리 초대하려 함
		// 이장님을 며칠에 초대할 수 있을까
		
		// n 묘묙 수 / t 각 묘묙 다 자라는데 걸리는 시간
				
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		int maxDay = 1;
		
		for (int i = 0; i < n; i++) {
			maxDay = Math.max(maxDay,  arr[i] + i + 2);
		}
		
		System.out.println(maxDay);
		
		
		sc.close();
	}

}
