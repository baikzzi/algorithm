package greedy;

import java.util.*;

public class B12845 {
	public static void main(String[] args) {
		// 모두의 마블이라는 게임에서 캐릭터 합성 이벤트 참여
		// 순서가 매겨진 여라장의 카드가 있음
		// 각각의 카드는 저마다 레벨이 있다.
		// 카드 A에 카드 B를 덧붙일 수 있다. 이때 붙이는 조건은
		// 1. 두 카드는 인접한 카드여야 함
		// 2. 업그레이드 된 카드 A의 레벨은 변하지 않음
		// 카드 합설할 때마다 두 카드 레벨의 합만큼 골드 받음
		// ex) c1, c2, c3로 연속된 3개 카드 각각 레벨은 40, 30, 30
		// 이 카드들을 합치는 과정에서 c3, c2 합쳐 임시 카드 x1 만듦
		// x1의 레벨은 30이고 획득 골드는 60이다.
		// 그 다음엔 c1에 x1을 합쳐 카드 x2를 만들면 레벨이 40이고 70 만큼의 골드 획득
		// 총 획득 골드는 130
		// 다른 방법으로  c1,c2로 x1 만들어서 레벨 40 획득 골드 70
		// x1과 c3로 x2 만들어서 레벨 40, 획득골드 70.
		// 총 획득 골드는 140
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = 0;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			sum += num;
			
			max = Math.max(max, num);
		}
		
		int result = sum + max*(n-2);
		System.out.println(result);
		
		sc.close();
	}
}
