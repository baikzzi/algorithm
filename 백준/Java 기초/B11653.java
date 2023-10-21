package javaBasic;

import java.io.*;

public class B11653 {
	static int N, mok;
	public static void main(String[] args) throws IOException {
		// 소인수분해 하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		mok = 2;
		
		if (N == 1);
		else {
			while (N != 1) {
				if (N % mok == 0) {
					N /= mok;
					bw.write(mok + "\n");
				} else mok++;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
