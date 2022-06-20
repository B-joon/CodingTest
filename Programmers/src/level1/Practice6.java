package level1;

// 콜라츠 추측

public class Practice6 {

	public static void main(String[] args) {
		
		int[] nums = {6, 16, 626331, 25378};
		
		for (int num : nums) {
			System.out.println(solution(num));
		}
		
	}
	
	public static int solution(int num) {
		int answer = 0;
		long numL  = num;
		if (numL == 1) {
			return answer;
		}
		
		do {
			if (answer == 500) {
				answer = -1;
				break;
			} else if (numL % 2 == 0) {
				numL /= 2;
				answer++;
			} else if (numL % 2 == 1) {
				numL = numL * 3 + 1;
				answer++;
			}
		} while (numL != 1);
		
		return answer;
	}
	
}
