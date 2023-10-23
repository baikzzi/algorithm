package javaBasic;

import java.io.*;

public class B24263 {
	static int N, cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		
		MenOfPassion(N);
		bw.write(cnt + "\n");
		bw.write(1 + "\n");
	
		bw.flush();
		bw.close();
		br.close();
	}
	static int MenOfPassion(int N) {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			cnt++;
		}
		return sum;
	}
}
