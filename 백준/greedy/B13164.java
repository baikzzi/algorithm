package greedy;

import java.io.*;
import java.util.*;

public class B13164 {
	static int N, K, ans;
	static int[] arr, difference;
	public static void main(String[] args) throws IOException {
		// N���� ��ġ�������� Ű ������� �Ϸķ� �� ����� �� K���� ���� ������ �Ѵ�.
		// �� ������ �ּ� �Ѹ� �̻� �־�� �ϰ�
		// ���� ���� ���� �������� ���� �������־�� �Ѵ�. 
		// ������ �ο����� ���� �ʿ�� ����.
		// �̷��� ������ ������ ���� ��ü Ƽ������ ���߷��� ��
		//������ Ƽ������ ���ߴ� ����� ������ ���� Ű�� ū ������ ���� ���� ������ Ű ���̸�ŭ ���.
		// �ִ��� ����� �Ʋ� K���� ���� Ƽ���� ���� ����� �ּ� ���� ���϶�
		
		// �׻� �ּ��� ������ �����Ѵ�
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
