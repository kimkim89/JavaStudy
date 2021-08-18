package day8;

public class MyClass {
	
	//#1 인터페이스가 필드 타입으로 사용된 경우
	// 	 필드에 구현 객체를 대입할 수 있음
	RemoteControl rc = new Television();
	
	//생성자
	MyClass() {
		
	}
	
	//#2  인터페이스가 생성자의 매개 변수 타입으로 사용될 경우, new 연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값으로 대입할 수 있음.
	//	 --> MyClass mc = new MyClass(new Television());
	MyClass(RemoteControl rc)  {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메서드
	void methodA() {
		// 로컬 변수
		//#3  인터페이스가 로컬 변수 타입으로 사용될 경우, 변수에 구현 객체 대입 가능
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}	
	
	//#4 인터페이스가 메서드의 매개 변수 타입으로 사용될 경우, 
	//	 메서드 호출 시 구현 객체를 매개값으로 대입 가능
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);	
	}
}
