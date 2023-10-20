package javaBasic;

import java.io.*;

public class B9506 {
	static int N, cnt;
	static String ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			ans = "";
			N = Integer.parseInt(br.readLine());
			if (N == -1) break;
			ans += N + " = 1";
			cnt = 1;
			for (int i = 2; i < N; i ++) {
				if (N % i == 0) {
					ans += " + " + i;
					cnt += i;
				}
			}
			if (cnt == N) {
				bw.write(ans + "\n");
			} else {
				bw.write(N + " is NOT perfect." + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
