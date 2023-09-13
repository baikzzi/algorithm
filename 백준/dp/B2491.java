package dp;

import java.io.*;
import java.util.*;

public class B2491 {
	public static void main(String[] args) throws IOException {
		// 0~9까지의 숫자로 나열된 수열이 있다.
		// 그 수열 안에서 연속해서 커지거나, 작아지는 수열 중 가장 긴 것을 찾아내어 그 길이를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int incre = 1, decre = 1;
		int up = 1, down = 1;
		
		for (int i = n-1; i > 0 ; i--) {
			if (arr[i] < arr[i-1]) { // 증가수열
				up++;
				down = 1;
			} else if (arr[i] > arr[i-1]) { // 감소수열
				down++;
				up = 1;
			} else { // 둘 다 해당
				up++;
				down++;
			}
			incre = Math.max(incre, up);
			decre = Math.max(decre, down);
		}
		bw.write(Math.max(incre, decre) + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
