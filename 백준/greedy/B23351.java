package greedy;

import java.util.*;

public class B23351 {
	static int n, k, a, b, ans = 1;
	static int[] arr;
	public static void main(String[] args) {
		// 캣닢을 직접 재배하려함
		// 일직선으로 놓인 n개의 화분에 캣닢이 하나씩 심어져 있다.
		// 각 화분은 k만큼의 수분을 머금고 있고, 매일 아래와 같은 순서대로 일어난다.
		// 1. 집사가 연속된 A개의 화분에 물을 준다. 이때 물을 준 화분에 수분은 B만큼씩 증가한다.
		// 2. 모든 화분의 수분이 1씩 감소한다.
		// 3. 수분이 0이된 화분에 있는 캣닢은 죽는다.
		// 모든 캣닢이 살아있는 기간이 최대한 길어지도록 물을 줄 때, 첫 캣닢이 죽는 날짜를 출력하는 프로그램
		// 첫날은 1일이다.
		
		// n 화분개수
		// k 초기 수분
		// a 집사가 물을 주는 연속된 화분 개수
		// b 수분 증가량
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();  
		arr = new int[n]; // 화분 개수만큼의 배열
		
		for (int i = 0; i < n; i++) { // 초기 수분 만큼 가지고 있는 화분
			arr[i] = k;
		}
		
		process();
		
	}
	static void process() {
		int idx = 0;
		while(true) {
			for (int i = idx; i < idx+a; i++) {
				arr[i%n] += b;
			}
			for (int i = 0; i < n; i++) {
				if (--arr[i] == 0) {
					System.out.println(ans);
					return;
				}
			}
			ans += 1;
			idx = (idx + a) % n;
		}
	}
}
