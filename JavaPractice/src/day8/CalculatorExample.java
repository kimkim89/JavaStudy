package day8;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();
		
		int resultPlus = cal.plus(3, 9);
		int resultMulti = cal.multi(3, 9);
		
		System.out.println("resultPlus= " + resultPlus);
		System.out.println("resultMulti= " + resultMulti);
		
		//참조변수 cal을 이용하여 execPlus() 메소드 호출
		int resultExecPlus = cal.execPlus(3, 9);
		System.out.println("default method 호출 결과: " + resultExecPlus);
		
		//static method 호출 시 클래스명.static메소드();로만 호출 가능
		int resultExecMulti = Calculator.execMulti(3, 9);
		System.out.println("static method 호출 결과: " + resultExecMulti);
	}
}
