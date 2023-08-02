package JavaBasic;

import java.util.Scanner;

public class B10798 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[][] arr = new String[5][15];
		
		for (int i = 0; i < 5; i++) {
			String str = in.nextLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = String.valueOf(str.charAt(j)); // char 배열은 초기값이 '0'이므로
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != null) {	// char 배열 선언 시 여기서 null과 비교하지 못한다.
					System.out.print(arr[j][i]);
				}
			}
		}
		in.close();
	}

}
