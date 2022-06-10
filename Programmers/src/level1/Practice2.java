package level1;

// 평균 구하기

public class Practice2 {
	public static void main(String[] args) {
		int[] arr1 = {1, -2, 3, 4};
		int[] arr2 = {5, 5};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
	}
	
	public static double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		
		answer = (double) sum / arr.length;
		
		return answer;
	}
}
