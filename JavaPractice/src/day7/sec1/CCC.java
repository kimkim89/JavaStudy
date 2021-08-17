package day7.sec1;

import day7.AAA;

public class CCC {
	public CCC() {
		AAA a = new AAA();
		a.field1 = 1;
		//a.field2 = 1; //다른 패키지 내에서 default 필드 접근 불가
		//a.field3 = 1; //private 필드 접근 불가
		
		a.method1();
//		a.method2();	//default 메서드 접근 불가
//		a.method3();	//private 메서드 접근 불가
	}
}
