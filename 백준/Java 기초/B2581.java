package javaBasic;

import java.io.*;

public class B2581 {
	static int M, N, sum, min;
	public static void main(String[] args) throws IOException {
		// M ~ N 사이 소수들의 합과 소수 중 최솟값 찾는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		M = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		min = N + 1; // 나중에 안 바뀌면 -1로 출력
		
		for (int i = M; i <= N; i++) {
			if (sosu(i)) { // 소수이면
				sum += i;
				min = Math.min(min,  i);
			}
		}
		
		if (sum == 0) bw.write(-1 + "\n");
		else {
			bw.write(sum + "\n" + min + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	static boolean sosu(int x) {
		if (x == 1) return false; // 1은 소수가 아님
		
		for (int i = 2; i <= (int)x/2; i++) if (x % i == 0) return false; // 나누어 떨어짐 == 소수 아님 (false 리턴)
		// @@ 소수판별하는 수 x의 절반 이상은 나누어볼 필요가 없다.@@
		return true; // 나누어 떨어지는 수가 없음 == 소수님 (true 리턴)
	}
}
