package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17202 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num1 = br.readLine();
		String num2 = br.readLine();
		
		int[] arr = new int[16];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 1) { // 짝수
				arr[i] = Integer.parseInt(String.valueOf(num1.charAt(idx)));
			} else { // 홀수
				arr[i] = Integer.parseInt(String.valueOf(num2.charAt(idx)));
				idx++;
			}
		}
		
		int temp;
				
		for (int i = arr.length - 1; i >= 2; i--) {
			for (int j = 0; j < i; j++) {
				temp = arr[j] + arr[j+1];
				arr[j] = (temp >= 10) ? temp-10 : temp; 
			}	
		}
		
		String result = "";
		
		result += String.valueOf(arr[0]);
		result += String.valueOf(arr[1]);
		int ans = Integer.parseInt(result);  // 2%이면 02로 나와서
		
		
		System.out.println(ans);
		
		br.close();
	}

}
