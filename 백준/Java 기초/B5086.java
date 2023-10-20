package javaBasic;

import java.io.*;
import java.util.*;

public class B5086 {
	static int A, B;
	public static void main(String[] args) throws IOException {
		// 두 수가 주어질 때 두 수의 관걔를 구하여라
		// 1. 약수 factor
		// 2. 배수 multiple
		// 3. 둘다 아니라면 neither
		// 테스트 케이스는 0 0 이 입력되면 종료
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			if (A == 0 && B == 0) {
				break;
			}
			if (A < B && B % A == 0) {
				bw.write("factor" + "\n");
			} else if (A > B && A % B == 0) {
				bw.write("multiple" + "\n");
			} else {
				bw.write("neither" + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
