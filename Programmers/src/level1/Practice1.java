package level1;

import java.util.List;
import java.util.ArrayList;

// 하샤드 수

public class Practice1 {

	public static void main(String[] args) {
		
		int[] testCases = {10, 102, 1324, 10000, 11, 12, 13};
		
		for (int i = 0; i < testCases.length; i++) {
			System.out.println(testCases[i] + "	: " + solution(testCases[i]));
		}
		
	}
	
	public static boolean solution(int x) {
		boolean answer = true;
		
		List<Integer> nums = new ArrayList<Integer>();
		int num = x;
		int sum = 0;
		
		while (num > 0) {
			nums.add(num % 10);
			num = num / 10;
		}
		
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		
		if (x % sum != 0) {
			return false;
		}
		
		return answer;
	}
	
}
