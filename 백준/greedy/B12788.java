package greedy;

import java.util.*;

public class B12788 {
	public static void main(String[] args) {
		// 인하대 프로그래밍 경시대회 개최
		// 이 대회는 손코딩으로 문제 풀어야함
		// 참가자에게 펜을 지급하기 위해 펜 구해야함
		// 구매하지 않고 ctp 회원들에게 펜을 빌리기로 함
		
		// ctp에는 n명의 회원들이 존재
		// 각각의 회원들의 필통에 있는 펜의 개수는 모두 다름
		// 최소 인원들에게 빌리는 것을 목표
		
		// 대회 참가자들 모두에게 펜을 지급해야 함
		// 한 팀이 k명의 팀원으로 구성되어 있을 때 몇명의 회원들에게 펜을 빌려야 하는가
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ctp 회원수
		
		int m = sc.nextInt(), k = sc.nextInt();
		int needPen = m * k;
		
		int[] ctp = new int[n];
		
		for (int i = 0; i < n; i++) {
			ctp[i] = sc.nextInt();
		}
		
		Arrays.sort(ctp); // 오름차순 정렬임
		
		int cnt = 0;
		for (int i = n-1; i >= 0; i--) {
			if (needPen <= 0) {
				break;
			} else {
				needPen -= ctp[i];
				cnt++;
			}
		}
		
		if (needPen <= 0) {
			System.out.println(cnt);
		} else {
			System.out.println("STRESS");
		}
		sc.close();
	}
}
