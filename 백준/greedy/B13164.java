package greedy;

import java.io.*;
import java.util.*;

public class B13164 {
	static int N, K, ans;
	static int[] arr, difference;
	public static void main(String[] args) throws IOException {
		// N명의 유치원생들을 키 순서대로 일렬로 줄 세우고 총 K개의 조로 나누려 한다.
		// 각 조에는 최소 한명 이상 있어야 하고
		// 같은 조에 속한 원생들은 서로 인접해있어야 한다. 
		// 조별로 인원수가 같을 필요는 없다.
		// 이렇게 나눠진 조들은 각자 단체 티셔츠를 맞추려고 함
		//조마다 티셔츠를 맞추는 비용은 조에서 가장 키가 큰 원생과 가장 작은 원생의 키 차이만큼 든다.
		// 최대한 비용을 아껴 K개의 조에 티셔츠 제작 비용의 최소 합을 구하라
		
		// 항상 최선의 선택이 존재한다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		difference = new int[N-1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N-1; i++) {
			difference[i] = arr[i+1] - arr[i];
		}
		
		Arrays.sort(difference);
		
		for (int i = 0; i < N-K; i++) {
			ans += difference[i];
		}
		
		bw.write(ans + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
