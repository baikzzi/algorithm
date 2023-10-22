package javaBasic;

import java.io.*;

public class B15894 {
	static long N;
	public static void main(String[] args) throws IOException {
		// 1*1 정사각형 개수가 주어지면 그에 해당하는 둘레를 두하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Long.parseLong(br.readLine());
		
		bw.write(N*4 + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
