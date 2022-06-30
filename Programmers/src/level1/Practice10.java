package level1;

// 정수 내림차순으로 배치하기

public class Practice10 {
	public static void main(String[] args) {
		
		long n = 118372;
		
		System.out.println(solution(n));
		
	}
	
	public static long solution(long n) {
		long answer = 0;
		
		String a = Long.toString(n);
		
		String[] b = new String[a.length()];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a.charAt(i) + "";
		}
		
		for (int i = 1; i < b.length; i++) {// 삽입 정렬
			for (int j = i; j >= 1; j--) {
				if (Integer.parseInt(b[j]) > Integer.parseInt(b[j - 1])) {
					String tmp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = tmp;
				}
			}
		}
		a = "";
		for (String c : b) {
			a += c;
		}
		
		return answer = Long.parseLong(a);
	}
}
