package level1;

// 정수 제곱근 판별

public class Practice9 {

	public static void main(String[] args) {
		
		System.out.println(solution(121L));
		
	}
	
	public static long solution(long n) {
		long answer = 0;
		
		long j = 1;
		long root = 0;
		
		for (long i = 1; i <= n; i++) {
			root = i * j;
			if (root == n) {
				answer = (i + 1) * (j + 1);
				break;
			}
			if (root > n) {
				answer = -1;
				break;
			}
			j++;
		}
		
		return answer;
	}
	
}
