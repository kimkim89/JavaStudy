package day3;

public class Operator1 {

	public static void main(String[] args) {
		
		int num1 = 8;
		System.out.printf("정수값 num1 : %d, %s\n", num1, Integer.toBinaryString(num1));
		
		int result1 = num1 >> 3;
		System.out.printf("num1 >> 2 : %d, %s\n", result1, Integer.toBinaryString(result1));
		
		int result2 = num1 << 2;
		System.out.printf("num1 >> 1 : %d, %s\n", result2, Integer.toBinaryString(result2));
		
		int result3 = ~num1;
		System.out.printf("~num1 : %d, %s\n", result3, Integer.toBinaryString(8));
		
		
	}

}


