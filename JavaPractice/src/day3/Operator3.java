package day3;

public class Operator3 {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		
		// 중첩 삼항 연산자 예시
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("MAX: " + max); // 결과: 300
		
		int min = a > b ? (b < c ? b : c) : (a < c ? a : c);
		System.out.println("MIN: " + min); // 결과: 100
		
		
	}
	
	
}
