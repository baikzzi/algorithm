package JavaBasic;

import java.util.Scanner;

public class B15439 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (i != j) {
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);
        
        in.close();
        
    }

}

    