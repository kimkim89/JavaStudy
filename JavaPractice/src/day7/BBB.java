package day7;

public class BBB {
	
	public BBB() {
		AAA a = new AAA();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; //private 필드 접근 안됨
		
		a.method1();
		a.method2();
		//a.method3(); //private 메서드 접근 불가
	}
}
