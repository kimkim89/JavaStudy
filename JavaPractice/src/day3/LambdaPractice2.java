package day3;

// #1 함수형 인터페이스 선언
@FunctionalInterface
interface MyFunction2 {
	//* run()함수 : 단순히 클래스에 속한 메서드를 호출하는 것
	void run(); // public abstract void run();
}

public class LambdaPractice2 {
	static void execute(MyFunction2 f) { // 매개변수 타입이 MyFunction인 메서드
		f.run();
	}
	
	
	static MyFunction2 getMyFunction() { // 반환 타입이 함수형 인터페이스인 MyFunction2 메서드		
//		MyFunction2 f = () -> System.out.println("f3.run()");
//		return f;  // f = 반환된 참조변수
		return () -> System.out.println("f3.run()"); // 17과 18번 라인의 코드를 한 줄로 변경해서 람다식 반환
		
	}
	
	public static void main(String[] args) {
		
		/* #2 람다식에 입력과 출력(반환타입도 없음) => #1 함수형 인터페이스 내 메서드에도 입력과 반환타입이 없도록 void run();으로 작성됨
		   	람다식의 매개변수와 반환타입과 함수형 인터페이스 내 추상 메서드의 매개변수 및 반환타입이 동일해야함! 
		*/
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction2 f1 = () -> System.out.println("f1.run()");
		
		/* #3 함수형 인터페이스를 직접 구현한 것을 보여주기 위해 작성*/
		MyFunction2 f2 = new MyFunction2() { // 익명클래스로 run()을 구현
			public void run() { // 반드시 public을 붙여야 함 
				System.out.println("f2.run()");
			}
		};
		
		// #4 getMyFunction 함수를 호출하면 System.out.println("f3.run()"); 가 f3에 저장됨
		MyFunction2 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);  // f1.run() 출력
		execute( ()-> System.out.println("run()")); // run() 출력
	}
}
