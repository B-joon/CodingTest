package level1;

import java.util.Arrays;

// 최대공약수와 최소공배수

public class Practice7 {

	public static void main(String[] args) {
		
		int[] n = {3, 2};
		int[] m = {12, 5};
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(solution(n[i], m[i])));
		}
		
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		int a = n;
		int b = m;
		
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		
		answer[0] = a;
		answer[1] = (n * m) / answer[0];
		
		return answer;
	}
	
}
