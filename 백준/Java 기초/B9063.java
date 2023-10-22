package javaBasic;

import java.io.*;
import java.util.*;

public class B9063 {
	static int N, minX, minY, maxX, maxY, X, Y, ans;
	public static void main(String[] args) throws IOException {
		// �Ӿ��� �̸��� ������ �������� ������ ��� ������ �����ϴ� 
		// ���� ���� ����, ���� �������� ������ ���� ���� ���簢���� ������ �Ӿ��� ������ �����Ѵ�.
		// N���� ���� �ѷ��δ� �ּ� ũ���� ���簢�� ���� ����ϴ� ���α׷�
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
