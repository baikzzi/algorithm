package dp;

import java.io.*;

public class B17212 {
	public static void main(String[] args) throws IOException {
		// 달나라 토끼들이 사용하는 화폐는 동전 뿐
		// 1, 2, 5, 7원 이렇게 4종류
		// 물건을 사고 동전으로 계산하는데 최소 개수가 아니면 불법
		// 합법이 되는 동전 개수를 출력하는 프로그램 작성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] coin = new int[100001];
		
		coin[1] = 1;
		coin[2] = 1;
		coin[5] = 1;
		coin[7] = 1;
		
		coin[3] = 2;
		coin[4] = 2;
		coin[6] = 2;
		
		for (int i = 8; i <= n; i++) {
			coin[i] = Math.min(coin[i-1], Math.min(coin[i-2], Math.min(coin[i-5], coin[i-7]))) + 1;
		}
			
		bw.write(coin[n] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
