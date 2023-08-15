package greedy;

import java.util.Scanner;

public class B4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int testCase = 1;
		
		while (sc.hasNext()) {
			int l = sc.nextInt(), p = sc.nextInt(), v = sc.nextInt();
			if (l == 0 && p == 0 && v == 0) {
				break;
			}
			
			int remainDay = v;
			int ans = 0;
			
			while (remainDay > 0) {
				if (remainDay > p) { // 남은 날이 한 주기보다 크면 가능 사이클만큼 사용
					int cycle = remainDay / p;
					remainDay -= p * cycle;
					ans += l * cycle;
				} else if (remainDay > l) { // 남은 날이 한 주기보다는 짧지만 이용가능 기간보다 많아 전부 사용
					ans += l;
					break;
				} else { // 한 주기에 이용 가능한 날 (l)보다 남은 날이 적으니 남은 날 모두 사용하기
					ans += remainDay;
					remainDay = 0;
				}
			}
			
			System.out.println("Case " + testCase++ + ": " + ans);
			
		}
		
		
		sc.close();		
	}

}
