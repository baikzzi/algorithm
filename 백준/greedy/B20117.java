package greedy;

import java.io.*;
import java.util.*;

public class B20117 {
	static int N, ans;
	static int[] arr, accSum;
	public static void main(String[] args) throws IOException {
		// 경북대 특산품 호반우는 품질에 따라 등급이 숫자로 매겨짐
		// N개의 호반우를 파려고 함 , 개별 or 묶음 판매 가능 , 이때 묶음은 어떤 부분집합을 말함
		// 하나의 오반우를 팔때 기존의 계산법으로는 품질 만큼의 가격으로 팔리게 된다.
		// 따라서 묶어파나 개별적으로 파나 상인들은 같은 금액을 번다.
		// 상인들은 더 많이 벌고 싶어 새로운 품질 계산법을 개발함
		// 묶음 판매 시 모든 호반우의 품질을 묶음의 '중앙값'으로 결정
		// 짝수 묶음 : (묶음개수 / 2 + 1)번째, 홀수 묶음 : ((묶음개수+1) / 2)번째로 중간값 정의
		// 최대 이익을 계산하는 프로그램 만들어라
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		if (N % 2 == 0) {
			for (int i = N / 2; i < N; i++) {
				ans += arr[i];
			}
			ans *= 2;
		} else {
			for (int i = (N+1) / 2; i < N; i++) {
				ans += arr[i];
			}
			ans *= 2;
			ans += arr[(N-1) / 2];
		}
		bw.write(ans + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
