package greedy;

import java.util.Scanner;

public class B2891 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), s = sc.nextInt(), r = sc.nextInt();
		int[] team = new int[n+2];
		
		for (int i = 0; i < s+r; i++) {
			int num = sc.nextInt();
			if (i < s) {
				team[num] -= 1;
			} else {
				team[num] += 1;
			}
		}
		
		
		for (int i = 1; i <= n; i++) {
			if (team[i] == -1) { // 수리가 필요하면
				if (team[i-1] == 1) { // 앞팀이 여분이 있으면
					team[i-1] -= 1; // 앞팀꺼 가져와서
					team[i] += 1; // 사용
				} else if (team[i+1] == 1) { // 뒤에팀이 여분이 있으면
					team[i+1] -= 1; // 뒤에팀꺼 가져와서
					team[i] += 1; // 사용
				} else { // 앞 뒤 다 여분 없으면 넘어가
					continue;
				}
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < team.length; i++) {
			if (team[i] == -1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
