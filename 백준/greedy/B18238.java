package greedy;

import java.util.Scanner;

public class B18238 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char prev = 'A';
		int totalDist = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char next = str.charAt(i);
			
			int pre = prev;
			int nxt = next;
			int minDist = 0;
			
			if (nxt > pre) {
				minDist = Math.min(nxt - pre, pre - (nxt - 26));
			} else {
				minDist = Math.min(pre - nxt, nxt - (pre - 26));
			}
			
			totalDist += minDist;
			prev = next;
		}
		
		System.out.println(totalDist);
		
		sc.close();
	}

}
