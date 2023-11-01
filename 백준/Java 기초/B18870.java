package javaBasic;

import java.io.*;
import java.util.*;

public class B18870 {
	static int N, rank;
	static int[] origin, sorted;
	public static void main(String[] args) throws IOException {
		// 입력받은 N개의 x좌표 중 본인보다 작은 좌표의 수(중복은 제거하고)로 압축됨
		// 풀이참조 : https://st-lab.tistory.com/279
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		origin = new int[N];
		sorted = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorted);
		
		for (int v : sorted) {
			if (!rankingMap.containsKey(v)) {
				rankingMap.put(v,  rank);
				rank++;
			}
		}
		
		for (int key : origin) {
			int ranking = rankingMap.get(key);
			bw.write(ranking + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
