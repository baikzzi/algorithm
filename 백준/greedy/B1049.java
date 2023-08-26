package greedy;

import java.util.Scanner;

public class B1049 {
	public static void main(String[] args) {
		// 기타에서 n개의 줄이 끊어짐
		// 되도록이면 최소 비용으로 기타줄을 새로 사거나 교체해야 함
		// 6줄 패키지 or 1개 또는 그 이상의 줄을 낱개로 구매 가능
		// 끊어진 기타줄 수 n
		// 기타줄 브랜드 m개
		// 각 브랜드의 6개 패키지 가격 & 낱개 가격
		
		// 이때 n개 사기 위해 필요한 최소 비용
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int minCost = 100000;
		int minPackCost = 1000;
		int minOneCost = 1000;
		
		for (int i = 0; i < m; i++) {
			int packCost = sc.nextInt(), oneCost = sc.nextInt();
			
			minPackCost = Math.min(minPackCost, packCost);
			minOneCost = Math.min(minOneCost, oneCost);
		}
		
		int packNum = n / 6;
		
		// 패키지만으로 사기
		if (n % 6 == 0) {
			minCost = Math.min(minCost, minPackCost * packNum);
		} else {
			minCost = Math.min(minCost, minPackCost * (packNum + 1));
		}
		
		// 낱개로만 사기
		minCost = Math.min(minCost,  minOneCost * n);
		
		// 패키지 최대로 사고 나머지 낱개로 사기
		int remain = n - (packNum * 6);
		int anotherCost = (packNum * minPackCost) + (minOneCost * remain);
		minCost = Math.min(minCost, anotherCost);
		
		System.out.println(minCost);
		
		sc.close();
	}

}
