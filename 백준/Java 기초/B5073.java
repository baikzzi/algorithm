package javaBasic;

import java.io.*;
import java.util.*;

public class B5073 {
	static int A, B, C, sum, max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			sum = A + B + C;
			max = Math.max(A,  Math.max(B,  C));
			if (A==0 && B==0 && C==0) {
				break;
			} else if (max >= sum - max) {
				bw.write("Invalid" + "\n");
			} else {
				if (A == B && B == C) bw.write("Equilateral" + "\n");
				else if (A!=B && B!=C && A!=C) bw.write("Scalene" + "\n");
				else bw.write("Isosceles" + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
