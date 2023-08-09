package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[8][8];
		int cnt = 0;
		
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				if (checkWhite(i, j) && str.charAt(j) == 'F') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		// 모든 칸 반복하면서 흰 칸이면서 말이 놓여져 (F) 있는 것 카운팅
		// F 이면 흰 바탕인지 체크하고 맞으면 cnt++;
		
	}
	public static boolean checkWhite(int i, int j) {// 흰 칸인지 확인하는 메소드
		
		if (i % 2 == 0 && j % 2 == 0) {			
			return true;
		} else if (i % 2 == 1 && j % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

}
