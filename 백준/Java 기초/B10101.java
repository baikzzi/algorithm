package javaBasic;

import java.io.*;

public class B10101 {
	static int sum;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// 삼각형의 세 각을 입력 받은 후 삼각형을 구분하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		if (sum == 180) {
			if (arr[0] == 60 && arr[1] == 60) bw.write("Equilateral" + "\n"); // 세 각의 크기가 같음
			else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) bw.write("Scalene" + "\n"); // 세 각의 크기가 모두 다름
			else bw.write("Isosceles" + "\n");
		} else {
			bw.write("Error" + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}