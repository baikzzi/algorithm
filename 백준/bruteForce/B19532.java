package bruteForce;

import java.io.*;
import java.util.*;

public class B19532 {
	static int a, b, c, d, e, f;
	public static void main(String[] args) throws IOException {
		// 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.
		// 다음 연립방정식에서 x와 y의 값을 계산하시오
		// ax + by = c
		// dx + ey = f
		// a, b, c, d, e, f, x, y 모두 -999 ~ 999가 보장되고 만족하는 (x, y)는 유일하게 존재
		// x와 y를 공백으로 구분해 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		f = Integer.parseInt(st.nextToken());
		
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (a*i + b*j == c && d*i + e*j == f) {
					System.out.println(i + " " + j);
					System.exit(0);
				}
			}
		}
	}
}
