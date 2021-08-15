package day3;

/* 20210814 백기선 자바스터디 DAY3 연산자 Practice 문제  */	
public class OperatorStudy2 {

	//numbers라는 int형 배열이 있다.
	//해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고는 모두 두번씩 들어있다.
	//오직 한 번만 등장하는 숫자를 찾는 코드를 작성하라.	
	
	public static void main(String[] args) {
		OperatorStudy2 os2 = new OperatorStudy2();
		int result = os2.solution(new int[] {5, 2, 4, 1, 2, 4, 5});
		System.out.println(result);
	}	
		
		//int[] numbers = new int[] {5, 2, 4, 1, 2, 4, 5};
		
		// XOR
		// 5 ^ 0 = 5
		// 101 <-- 5 이진수 	
		// 000 <-- 0 이진수  	
		// ---------------
		// 101
		
		// 5 ^ 5 = 0
		// 101 <-- 5 이진수 	
		// 101 <-- 5 이진수  	
		// ---------------
		// 000
		
		//5 ^ 1 ^ 5 => (5 ^ 5) ^ 1 = 0 ^ 1 = 1
		private int solution(int[] numbers) {
			/*for (int i = 0; i < numbers.length; i++) {
				int number = numbers[i];
			}*/
			
			int result = 0;
			for (int number : numbers) {
				result ^= number;				
			}
			
			return result;
		}	
	
}
