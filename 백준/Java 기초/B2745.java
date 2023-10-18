package javaBasic;

import java.io.*;
import java.util.*;

public class B2745 {
	static int B, ans, num, len;
	static String N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = st.nextToken(); // B진수 숫자
		B = Integer.parseInt(st.nextToken()); // 진수
		len = N.length();
		
		for (int i = 0; i < len; i++) {
			num = Integer.valueOf(N.charAt(len - 1 - i));
			// 'A'의 아스키코드 65이다. A는 10진수이니 55빼면 num에 몇진수인지 들어감
			// 0 ~ 9의 아스키코드는 48~57이기때문에 55빼는게 아니라 48을 빼야함
			if (48 <= num && num <= 57) num -= 48;
			else if (65 <= num && num <= 90) num -= 55;
			ans += Math.pow(B, i) * num;
		}
		
		bw.write(ans + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
