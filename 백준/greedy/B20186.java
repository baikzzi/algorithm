package greedy;

import java.util.*;

public class B20186 {
	public static void main(String[] args) {
		// n개의 자연수가 좌우로 배열되어 있음
		// 이중 k개를 한번에 골라야함
		// 고른 수 각각에 대해 좀수를 계산할 것
		// 점수는 자신의 수에서 자신의 왼쪽에 있는 수 중 선택된 수의 개수를 뺀 값이다.
		// 이렇게 고른 수 각각에 그 점수를 계산한 후 전체점수는 계산된 점수들의 합이다.
		// 전체 점수가 최대가 되도록 k개의 수를 골라야 함
		// ex
		// n = 5
		// 2 3 1 2 1
		// k = 3
		// 입력받은 수 들 중에서 가장 큰 k개 골라냄
		// 정렬해서
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		int[] arr = new int[n];
		int[] idx = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			idx[i] = i;
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					temp = idx[i];
					idx[i] = idx[j];
					idx[j] = temp;
				}
			}
		}
		int[] maxArr = new int[k];
		int[] maxIdx = new int[k];
		
		for (int i = 0; i < k; i++) {
			maxArr[i] = arr[i];
			maxIdx[i] = idx[i];
		}
		
		for (int i = 0; i < k-1; i++) {
			for (int j = i+1; j < k; j++) {
				if (maxIdx[i] > maxIdx[j]) {
					int temp = maxIdx[i];
					maxIdx[i] = maxIdx[j];
					maxIdx[j] = temp;
					
					temp = maxArr[i];
					maxArr[i] = maxArr[j];
					maxArr[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0 ; i < k; i++) {
			sum += (maxArr[i] - i);
		}
		
		System.out.println(sum);
		
		
		// arr를 정렬 후 상위 몇개만 고르고
		// 
		
		
		sc.close();
	}

}
