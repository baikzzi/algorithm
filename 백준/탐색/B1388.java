package search;

import java.util.Scanner;

public class B1388 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		char[][] tileArr = new char[n][m];
		boolean[][] boolArr = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				tileArr[i][j] = str.charAt(j);
			}
		}
		
		int tileCnt = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(boolArr[i][j] == false) { // Ÿ���� �����������ʰ�
					tileCnt++;
					boolArr[i][j] = true;
					if (tileArr[i][j] == '-') { // '-'Ÿ�� �϶�
						int tempJ = j;
						while(++tempJ < m) {
							if (tileArr[i][tempJ] == '|') {
								break;
							}
							boolArr[i][tempJ] = true;
						}
					} else { // '|' Ÿ�� �϶�
						int tempI = i;
						while(++tempI < n) {
							if (tileArr[tempI][j] == '-') {
								break;
							}
							boolArr[tempI][j] = true;
						}
					}
				}
			}
		}
			
		System.out.println(tileCnt);
		
		sc.close();
	}

}