package javaBasic;

import java.io.*;
import java.util.*;

public class B9063 {
	static int N, minX, minY, maxX, maxY, X, Y, ans;
	public static void main(String[] args) throws IOException {
		// 임씨의 이름이 새겨진 옥구슬이 나오는 모든 지점을 포함하는 
		// 가장 작은 남북, 동서 방향으로 평행한 변을 갖는 직사각형의 대지를 임씨의 소유로 인정한다.
		// N개의 점을 둘러싸는 최소 크기의 직사각형 넒이 출력하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		minX = 100001;
		maxX = -100001;
		minY = 100001;
		maxY = -100001;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			minX = Math.min(minX,  X);
			maxX = Math.max(maxX,  X);
			minY = Math.min(minY,  Y);
			maxY = Math.max(maxY,  Y);
		}
		ans = (maxX - minX) * (maxY - minY);
		bw.write(ans + "\n");
	
		bw.flush();
		bw.close();
		br.close();
	}
}
