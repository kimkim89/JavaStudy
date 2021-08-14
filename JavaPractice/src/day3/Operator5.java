package day3;

public class Operator5 {
	public static void main(String[] args) {		
	
//		MyFunction f = new MyFunction() { //익명클래스(클래스 선언과 객체 생성 동시에)
//					// new 조상이름 => 조상이름은 클래스나 인터페이스가 될 수 있음
//			
//			public int max(int a, int b) { //오버라이딩 - 접근제어자는 좁게 못 바꿈
//				return a > b ? a : b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수 타입은 함수형 인터페이스로 함
		MyFunction f = (a, b)-> a > b ? a : b; //람다식. 익명객체
		
		
		int value = f.max(3,5); //함수형 인터페이스
		System.out.println("value= " + value);
	}
}

/*	함수형 인터페이스: 단 하나의 추상 메서드만 가져야함
  	FunctionalInterface 애노테이션을 사용할 경우, 
  	추상메서드를 2개 이상 작성할 때 컴파일 에러를 보여줌     */
@FunctionalInterface 
interface MyFunction {
	//public abstract int max(int a, int b);
	int max(int a, int b); // public abstract 생략 가능
}
