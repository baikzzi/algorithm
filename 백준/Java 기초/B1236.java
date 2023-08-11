package javaBasic;

import java.util.Scanner;

public class B1236 {
	
	public static void main(String[] args) {
		// 안전한 행과 열음 true로 바꿔놓고 바뀌었을때 안전하지 않은 행과 열의 수를 감소시킨다.
		// 남은 안전하지 않은 행과 열의 수 중 큰 수를 사용하여 작은 수까지 안전하게 경비원 배치 가능
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		char[][] arr = new char[n][m];
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];
		int unSafeRow = n;
		int unSafeCol = m;
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
				if (arr[i][j] == 'X') {
					if (row[i] == false) {
						row[i] = true;
						unSafeRow--;
					}
					if (col[j] == false) {
						col[j] = true;
						unSafeCol--;
					}					
				}
			}
		}
		System.out.println(Math.max(unSafeRow, unSafeCol));
		
		sc.close();		
	}
}
