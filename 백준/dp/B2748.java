package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			long[] fiboArr = new long[n+1]; // 76번 피보나치 수부터 int 범위 넘어가서 long 타입으로 변경함
			fiboArr[0] = 0;
			fiboArr[1] = 1;
			
			for (int i = 2; i <= n; i++) {
				fiboArr[i] = fiboArr[i-1] + fiboArr[i-2];
			}
			System.out.println(fiboArr[n]);
		}		
	}
}
