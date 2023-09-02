package greedy;

import java.util.*;

public class B15720 {
	public static void main(String[] args) {
		// 카우버거 세트할인 도입 원함
		// 세트 메뉴는 버거 1, 사이드 1, 음료 1 선택 시 각 제품에 대해 10% 할인 적용
		// 세트 할인 프로그램 만들기
		
		// 첫줄에 버거 개수 b, 사이드 개수 c, 음료 개수 d가 공백을 두고 입력
		// 둘째 줄부터 넷째 줄까지 버거, 사이드, 음료 순으로 가격이 주어짐
		
		
		// 최소 개수 저장(최대 세트 개수), 최대 개수 저장
		// 3X최대 개수로 배열 생성 후
		// 앞에서 부터 가격 넣기
		// 오른차순 정렬하고
		// 뒤에서부터 최소개수(최대 세트 개수)만큼 10% 할인하면서 저장
		// 그 뒤로는 다 더하기
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
		
		int setNum = Math.min(b, Math.min(s, d));
		int maxNum = Math.max(b, Math.max(s, d));
		
		int[][] priceArr = new int[3][maxNum];
		
		for (int i = 0; i < b; i++) {
			priceArr[0][i] = sc.nextInt();
		}
		for (int i = 0; i < s; i++) {
			priceArr[1][i] = sc.nextInt();
		}
		for (int i = 0; i < d; i++) {
			priceArr[2][i] = sc.nextInt();
		}
		
		Arrays.sort(priceArr[0]);
		Arrays.sort(priceArr[1]);
		Arrays.sort(priceArr[2]);
		
		int beforeDis = 0;
		int afterDis = 0;
		
		for (int j = maxNum-1; j >= 0; j--) {
			for (int i = 0; i < 3; i ++) {
				if (setNum > 0) {
					afterDis += (priceArr[i][j] * 0.9);
					beforeDis += priceArr[i][j];
					
				} else {
					afterDis += priceArr[i][j];
					beforeDis += priceArr[i][j];
				}
			}
			setNum--;
		}
		
		System.out.println(beforeDis);
		System.out.println(afterDis);
			
		
		sc.close();
	}
}
