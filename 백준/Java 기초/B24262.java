package javaBasic;

import java.io.*;

public class B24262 {
	static int N, cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		MenOfPassion(N);
		bw.write(cnt + "\n");
		bw.write(0 + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	static int MenOfPassion(int N) {
		int i = (int) Math.floor(N /2);
		cnt++;
		return i; // 코드 1
	}
}
