package bruteForce;

import java.io.*;
import java.util.*;

public class B2798 {
	static int N, M, maxAns;
	static int[] arrN;
	public static void main(String[] args) throws IOException {
		//블랙잭 규칙 : 카드의 합이 21이 넘지 않는 한도 내에서 합을 최대한 크게 하는 게임
		// 김정인ver의 블랙잭에서 각 카드에 양의 정수가 쓰여있음
		// 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓음
		// 그런 후 딜러는 숫자 M을 크게 외침
		// 이제 플레이어는 제한된 시간 안에 N장의 카드 중 3장의 카드를 골라야 한
		// 블랙잭의 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 함
		// 고른 3장의 합을 구해 출력하는 프로그램 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arrN = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		blackJack(0, 0, 0);
		bw.write(maxAns + "\n");
				
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void blackJack(int sum, int idx,  int cnt) {
		if (sum > M || (idx == N && cnt < 3)) return; // idx 넘어가면 안됨
		if (cnt == 3) { // 3개의 카드를 골랐을 경우
			if (sum <= M && sum > maxAns) maxAns = sum;
			return;
		}
		blackJack(sum+arrN[idx], idx+1, cnt+1);// 현재 idx 포함
		blackJack(sum, idx+1, cnt);// 현재 idx 미호함
	}
}
