package javaBasic;

import java.io.*;
import java.util.*;

public class B1181 {
	static int N;
	static String[] arr;
	public static void main(String[] args) throws IOException {
		// 주어진 N개의 단어를 글자 길이 순 오름차순으로
		// 글자 길이가 같다면 사전 순으로 정렬
		// 풀이 참조 : https://st-lab.tistory.com/112
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) return s1.compareTo(s2);
				else return s1.length() - s2.length();
			}
		});
		
		bw.write(arr[0] + "\n");
		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i-1])) bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
