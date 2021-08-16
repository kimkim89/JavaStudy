package day6;

public class Computer extends Calculator{
	
	//부모클래스인 Calculator에 있는 areaCircle(double r) 함수를 재정의 함.
	//@Override 어노테이션 생략 가능하지만, 이를 사용 시 areaCircle()메소드가 정확히 재정의된 것인지 확인 가능
	
	
	@Override 
	double areaCircle(double r) {		
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
