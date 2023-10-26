package javaBasic;

import java.io.*;
import java.util.*;

public class B2751 {
	static int N;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
//		for (int i = 0; i < N - 1; i++) {
//			for (int j = i + 1; j < N; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < N; i++) {
//			bw.write(arr[i] + "\n");
//		}
		
		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			bw.write(arr[i] + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
