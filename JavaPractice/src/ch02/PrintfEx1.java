package ch02;

public class PrintfEx1 {
	
	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
//		float f = 123.456789f;
		double f = 123.456789;
		System.out.printf("%f%n", f);
		
		
		System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
	}
	
}
