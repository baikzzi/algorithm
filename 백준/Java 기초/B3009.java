package javaBasic;

import java.io.*;
import java.util.*;

public class B3009 {
	static int[] arrX, arrY;
	public static void main(String[] args) throws IOException {
		// 세 점이 주어졌을 때 축에 평행한 직사각형을 만들기 위한 네번째 점을 찾는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		arrX = new int[3];
		arrY = new int[3];
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			arrX[i] = Integer.parseInt(st.nextToken());
			arrY[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrX);
		Arrays.sort(arrY);
		if (arrX[0] == arrX[1]) bw.write(arrX[2] + " ");
		else bw.write(arrX[0] + " ");
		
		if (arrY[0] == arrY[1]) bw.write(arrY[2] + "\n");
		else bw.write(arrY[0] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
