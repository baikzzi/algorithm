package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B11508 {
	public static void main(String[] args) {
		// ksg 편의점에서 유제품 투쁠원 세일중
		// 이 편의점에서는 3개 한번에 사면 그중 가장 싼것은 무료 지불, 나머지 두개 가격만 지불하면 된다.
		// 한번에 3개의 유제품을 사지 않으면 할인없이 정가 지불
		// n개의 유제품 수를 입력받아 최소지불비용을 구하여라
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int cost = 0;
		
		for (int i = 0; i < n; i++) {
			if (i % 3 == 2) {
				continue;
			} else {
				cost += arr[i];
			}
		}
		
//		int pair = n / 3;
//		int start = 0;
//		int finish = n-1;
//		int cost = 0;
//		
//		for (int i = 0; i < pair; i++) {
//			cost += arr[++start] + arr[finish--];
//			start++;
//		}
//		
//		for (int i = start; i <= finish; i++) {
//			cost += arr[i];
//		}
//		
		System.out.println(cost);
	}

}
