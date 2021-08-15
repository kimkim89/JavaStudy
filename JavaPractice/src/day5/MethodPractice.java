package day5;

public class MethodPractice {
	
	int hour;
	int minute;
	int second;

	
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 10L);
		System.out.println(result1);
		
		double result2 = mm.divide(20, 5);
		System.out.println(result2);
	
		MethodPractice t = new MethodPractice();
		t.hour = 12;
		t.minute = 34;
		t.second = 56;
		
		System.out.println(t.hour);
	
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a = b;
		return result;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
}


	