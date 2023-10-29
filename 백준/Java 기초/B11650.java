package javaBasic;

import java.io.*;
import java.util.*;

public class B11650 {
	static int N, s;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		// 주어진 (x, y) 좌표 정렬
		// 2차원 배열은 Arrays.sort() 안되니 람다식 사용해 확장해야함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[N][2];
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) return e1[1] - e2[1];
			else return e1[0] - e2[0];
		});
		
		
		for (int i = 0; i < N; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
	