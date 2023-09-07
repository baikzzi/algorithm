package greedy;

import java.io.*;
import java.util.*;

public class B16208 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// a1 ~ an의 총 n개의 쇠막대가 필요해짐
		// 그가 가진 것은 a1 + ... + an 길이의 하나의 쇠막대임
		// 이 막대를 잘라서 필요하던 n개의 쇠막대를 만들것
		// 길이 x+y인 막대를 길이 x, y로 각각 자르려면 두 길이의 곱인 xy의 비용이 든다.
		// 최소비용으로 n개의 쇠막대를 얻고 싶다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[n];
		int len = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			len += arr[i];
		}
		
		Arrays.sort(arr);
		
		long cost = 0;
		for (int i = 0; i < n - 1; i++) {
			len -= arr[i];
			cost += len * arr[i];
		}
		
		bw.write(cost + "\n");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
