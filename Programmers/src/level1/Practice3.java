package level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자

public class Practice3 {

	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		
		System.out.println(Arrays.toString(solution(x, n)));
		
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		answer[0] = x;
		
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}
		
		return answer;
	}
	
}
