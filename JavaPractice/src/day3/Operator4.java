package day3;


@FunctionalInterface
interface LambdaTest{
	int values(int a, int b);
}

public class Operator4 {
	
	public void printValues(LambdaTest test1) {
		int number = test1.values(6, 3);
		System.out.println("Number : " + number); // 출력순서(3) Number : 3
	}
	
	public static void main(String[] args) {
		Operator4 op = new Operator4();
		op.printValues((a,b) -> {
			System.out.println("parameter a : " + a + ", parameter b : " + b); // 출력순서(1) parameter a : 6, parameter b : 3
			System.out.println("a + b : " + (a+b)); // 출력순서(2) a + b : 9
			return a-b;
		});
	}

}
