package javaBasic;

import java.io.*;

public class B24265 {
	static Long N, cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Long.parseLong(br.readLine());
		
//		MenOfPassion(N);
		bw.write((Long)N*(N-1)/2 + "\n");
		bw.write(2 + "\n");
	
		bw.flush();
		bw.close();
		br.close();
	}
	static int MenOfPassion(int N) {
		int sum = 0;
		for (int i = 1; i < N; i++) {
			for (int j = i+1; j <= N; j++) {
//					sum += i*j; // 코드 1
					cnt++;
			}
		}
		return sum;
	}
}
