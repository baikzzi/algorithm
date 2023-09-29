package greedy;

import java.io.*;
import java.util.*;

public class B29155 {
	static int N, needSolve;
	static int total = 240;
	static int[] probCnt;
	static int[][] problem;
	public static void main(String[] args) throws IOException {
		// 코테 취준생을 위한 구름 level 1~5
		// 1~5까지 난이도가 같거나 증가하는 순서대로 문제 풀 것임
		// 구름이는 문제들의 지문을 보고 살펴본 N개의 문제들을 푸는 데 걸릴 예상시간을 모두 체크해봄
		// 각 문제 사이에는 휴식시간이 필요
		// 난이도가 같을 경우 : 두 문제를 푸는 데 걸리는 시간의 차이만큼의 휴식시간 필요
		// 난이도 증가시키는 경우 : 60분의 휴식시간 필요
		// 즉, 구름이가 문제 푸는 데 걸리는 시간 = 푼 문제 예상시간 합 + 문제 사이 휴식 시간의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		probCnt = new int[6];
		problem = new int[2][N];
		
		// 난이도별 풀어야하는 문제 수 저장 배열 초기화
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= 5; i++) {
			probCnt[i] = Integer.parseInt(st.nextToken());
			needSolve += probCnt[i];
		}
		
		// N개의 문제의 난이도와 예상 소요 시간 저장 배열 초기화
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			problem[0][i] = Integer.parseInt(st.nextToken()); // 난이도
			problem[1][i] = Integer.parseInt(st.nextToken()); // 예상 소요 시간
		}
		
		// 정렬 직접 짜보기
		for (int i = 0; i < N - 1; i++) {
			for (int j = i; j < N; j++) {
				if (problem[0][i] > problem[0][j]) {
					// 난이도 정렬
					int temp = problem[0][i];
					problem[0][i] = problem[0][j];
					problem[0][j] = temp;
					
					// 난이도에 따라 예상 소요시간 정렬
					temp = problem[1][i];
					problem[1][i] = problem[1][j];
					problem[1][j] = temp;
				} else if (problem[0][i] == problem[0][j]) {
					if (problem[1][i] > problem[1][j]) { // 난이도 같으니 소요 시간만 교환
						int temp = problem[1][i];
						problem[1][i] = problem[1][j];
						problem[1][j] = temp;
					}
				}
			}
		}
		
		int level = 1; // 현재 풀어야하는 난이도
		for (int i = 0; i < N; i++) {
			if (needSolve == 0) break; // 풀어야 할 문제 없으면 끝
			if (level != problem[0][i]) continue; // 현재 풀어야하는 난이도와 다르면 문제 넘어감
			if (probCnt[level] > 1) { // 다음 문제도 같은 난이도 풀어야한다면 차이 더함
				total += problem[1][i] + (problem[1][i+1] - problem[1][i]);
				probCnt[level]--;
				needSolve--;
			} else if (probCnt[level] == 1) { // 현재 난이도의 마지막 문제
				total += problem[1][i];
				probCnt[level]--;
				level++;
				needSolve--;
			}
		}
		
		bw.write(total + "\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}

// https://www.acmicpc.net/problem/29155
// 일단 보류
// 정렬까지 했는데 출력이 안된다.
