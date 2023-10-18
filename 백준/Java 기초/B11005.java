package javaBasic;

import java.io.*;
import java.util.*;

public class B11005 {
	static int N, B, exp, times;
	static String str;
	static char cha;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		while (N >= Math.pow(B,  exp+1))  exp++; // max 지수구함
		for (int i = exp; i >= 0; i--) { // 지수 감소하면서 자리수 구하기
			times = (int) (N /  Math.pow(B,  i)); // 몫이 자리값
			N -= Math.pow(B, i) * times;
			if (times >= 10) {
				times += 55;
				cha = (char) times;
				bw.write(cha);
			} else {
				str = times + ""; // 문자열롤 바꾸기
				bw.write(str);
			}
			// 10보다 크면 알파벳(아스키코드)로 변환하는 코드 작성			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
