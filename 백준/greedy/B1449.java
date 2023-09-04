package greedy;

import java.util.*;

public class B1449 {
	public static void main(String[] args) {
		// 파이프에서 물이 새는 곳은 신기하게도 
		// 가장 왼쪽에서 정수만큼 떨어진 거리만 물이 샌다
		// 길이가 L인 테이프 무한개 갖고있을때
		// 물 막을 때 적어도 그 위치의 좌우 0.5만큼 간격을 줘야 물이 다시는 안 샌다고 생각함
		// 물이 새는 곳의 위치와 / 테이프 길이가 주어졌을 때
		// 필요한 테이프 최소 개수 구하기
		// 테이프를 자를 수 없고 겹쳐 붙이는 것은 가능하다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), l = sc.nextInt();
		int[] hole = new int[n];
		
		for (int i = 0; i < n; i++) {
			hole[i] = sc.nextInt();
		}
		
		Arrays.sort(hole);
		
		int cnt = 0;
		int covered = 0;
		for (int i = 0; i < n; i++) {
			if (hole[i] <= covered) {
				continue;
			} else {
				cnt++;
				covered = hole[i] + l - 1;
			}
			
		}
		
		System.out.println(cnt);
		
		
		sc.close();
	}

}
