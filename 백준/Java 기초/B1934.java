package javaBasic;

import java.io.*;
import java.util.*;

public class B1934 {
	static int TEST_CASE, ans, a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TEST_CASE = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < TEST_CASE; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			ans = (a * b) / gcd(a, b);
						
			bw.write(ans + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
