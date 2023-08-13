package greedy;

import java.util.Scanner;

public class B2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		int bonus = 1; // 커플석이 있으면 +1
		
		for (int i = 0; i < n; i++) {
			cnt += 1;
			if (str.charAt(i) == 'L') {
				if (bonus == 1) {
					cnt++;
					bonus--;
				}
				i++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}