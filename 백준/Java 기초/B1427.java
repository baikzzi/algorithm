package javaBasic;

import java.io.*;
import java.util.Arrays;

public class B1427 {
	static String str;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		str = br.readLine();
		arr = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(str.charAt(i)+"");
		}
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			bw.write(arr[i] +"");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
