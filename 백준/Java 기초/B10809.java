package javaBasic;

import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {

		// a부터 z까지 처음 등장하는 위치(아스키코드로 변환한 a부터 z까지 반복해서
		// 문자열에 그 문자가 있으면 해당 인덱스 출력 없으면 -1 출력
		// 뒤에서부터 반복하면 결과적으로 처음등장하는 (앞에 등장하는) 인덱스만 남아있을듯
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		int len = str.length() - 1;
		
		int[] arr = new int[26]; // 26개 알파벳의 처음 나오는 위치 저장할 배열
		for (int i = 0; i < 26; i++) { // 모든 배열을 -1로 초기화
			arr[i] = -1;
		}
		
		for (int i = len; i >= 0; i--) { // 문자 길이만큼 반복, 거꾸로, 해당 문자의 해당 배열에 현재 i값 저장
			int idx = str.charAt(i);
			arr[idx - 97] = i; // 'a'의 아스키코드가 97인데 이것을 인덱스 0에 저장해야하니 -97했음
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		in.close();
	}

}
