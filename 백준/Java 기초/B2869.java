package javaBasic;

import java.io.*;
import java.util.*;

public class B2869 {
	static int A, B, V, ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		if (A == V) {
			bw.write(1 + "\n");
		} else {
			ans = (int) Math.ceil((double)(V - A) / (A - B)) + 1;
			bw.write(ans + "\n");
		}		
		bw.flush();
		bw.close();
		br.close();
	}
}
