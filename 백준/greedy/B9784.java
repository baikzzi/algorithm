package greedy;

import java.util.Scanner;

public class B9784 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for (int i = 1; i <= testCase; i++) {
			int n = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
			// n 계란 수
			// p 개 이상 담는 것 위험
			// q 냄비에 담을 수 있는 최대 그램 수
			
			int[] eggArr = new int[n];
			for (int j = 0; j < n; j++) {
				eggArr[j] = sc.nextInt();
			}
			
			// 그램 수 오름차순 정렬
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (eggArr[j] > eggArr[k]) {
						int temp = eggArr[j];
						eggArr[j] = eggArr[k];
						eggArr[k] = temp;
					}
				}
			}
			
			// 무게와 개수 내에서 최대한 담기
			int eggCnt = 0;
			int nowTotalGram = 0;
			for (int gram : eggArr) {
				if (p > eggCnt && q >= nowTotalGram + gram) {
					eggCnt++;
					nowTotalGram += gram;
					
				}
			}
			System.out.println("Case " + i + ": " + eggCnt);
			
		}
		
		sc.close();
	}

}
