package javaBasic;

import java.io.*;
import java.util.*;

public class B10815 {
	static int N, M, start, end, mid;
	static int[] arr, findNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		findNum = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			findNum[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			if (binarySearch(findNum[i])) bw.write("1 ");
			else bw.write("0 ");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean binarySearch(int num) {
		start = 0;
		end = arr.length - 1;
		while (start <= end) {
			if (arr[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
			if (arr[mid] == num) return true;
		}
		return false; // ¾øÀ¸¸é
	}
}
