package dp;

import java.util.*;

public class B13301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		long[] tile = new long[n+1];
		
		// n개 타일 썼을 때 둘레 == tile[n]
		
		
		if (n == 1) {
			System.out.println(4);
		} else {
			tile[1] = 4;
			tile[2] = 6;
			for (int i = 3; i <= n; i++) {
				tile[i] = tile[i-1] + tile[i-2];
			}
			
			System.out.println(tile[n]);
		} 
	}

}
