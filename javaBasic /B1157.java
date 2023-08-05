package javaBasic;

import java.util.Scanner;

public class B1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		String UpperStr = str.toUpperCase();
		
		int[] arr = new int[26];
		
		int len = str.length();
		
		for (int i = 0; i < len; i++) { // 문자 길이만큼 반복, 거꾸로, 해당 문자의 해당 배열에 현재 i값 저장
			int idx = UpperStr.charAt(i);
			arr[idx - 65] += 1; // 'A'의 아스키코드가 65인데 이것을 인덱스 0에 저장해야하니 -65했음
		}
		
		int result = findMaxIdx(arr);
		
		if (result != -1) {
			result += 65; // 다시 아스키코드로
			System.out.println((char)result);
		} else {
			System.out.println("?");
		}
		
		
		in.close();
	}
	
	public static int findMaxIdx(int[] arr) { // 배열에서 max idx 찾는 함수
		int idx = 0;
		int maxNum = arr[0];
		boolean doubleMax = false;
				
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < maxNum) {
				continue;
			} else if (arr[i] > maxNum) {
				idx = i;
				maxNum = arr[i];
				doubleMax = false;
			} else {
				doubleMax = true;
			}
			
		}
		
		if (doubleMax) {
			return -1;
		} else {
			return idx;
		}
	}

}
