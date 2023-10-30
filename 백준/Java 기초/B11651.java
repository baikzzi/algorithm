package javaBasic;

import java.io.*;
import java.util.*;

public class B11651 {
	static int N;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		// 11650번과 마찬가지로 Arrays.sort()는 2차원 배열 정렬을 지원하지 않기 때문에
		// 람다 표현식 사용하여 정의한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[1] == e2[1]) return e1[0] - e2[0];
			else return e1[1] - e2[1];
		});
		
		for (int i = 0; i < N; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

