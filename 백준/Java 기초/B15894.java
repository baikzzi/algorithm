package javaBasic;

import java.io.*;

public class B15894 {
	static long N;
	public static void main(String[] args) throws IOException {
		// 1*1 ���簢�� ������ �־����� �׿� �ش��ϴ� �ѷ��� ���ϴ� ���α׷�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Long.parseLong(br.readLine());
		
		bw.write(N*4 + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
