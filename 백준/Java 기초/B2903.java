package javaBasic;

import java.io.*;

public class B2903 {
	static int N, ans, num;
	public static void main(String[] args) throws IOException {
		// sf영화를 찍으려 함 >> 외계 지형이 필요
		// cg처리 하려함
		// 중앙 이동 알고리즘을 이용해서 만들려고 함
		// 정사각형을 이루는 점 4개를 고름
		// 그 후 다음 과정을 거침
		// 1. 정사각형의 각 변의 중앙에 점을 하나 추가한다.
		// 2. 정사각형의 중심에 점 하나를 추가한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
//		num = 2;
//		System.out.println(Math.pow(2,  N-1));
//		System.out.println(num + Math.pow(2,  N-1));
//		System.out.println(Math.pow(num + Math.pow(2,  N-1), 2));
		
		num = 2;
		for (int i = 0; i < N; i++) {
			num += (int) Math.pow(2,  i);
		}
		
		ans = (int) Math.pow(num, 2);
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();		
	}
}
