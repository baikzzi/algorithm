package javaBasic;

import java.io.*;
import java.util.*;

public class B10814 {
	static int N, a, b;
	static String[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new String[N][2];
				
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
				
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for (int i = 0; i < N; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
