package level1;

import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기

public class Practice11 {
	public static void main(String[] args) {
		
		long n = 8972854932l;
		
		System.out.println(Arrays.toString(solution(n)));
		
	}
	
	public static int[] solution(long n) {
		int[] answer = {};
		
		String a = Long.toString(n);
		
		answer = new int[a.length()];
		
		for (int i = 0; i < answer.length; i++) {
			long tmp = n % 10;
			answer[i] = (int) tmp;
			n = n / 10;
		}
		
		return answer;
	}
}
