package day3;

public class LambdaPractice {
	/* 메모 하기 위해서 사용 
	//람다식 작성하는 방법 
	// #1 기존 메서드
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	// #2 메서드 이름과 반환타입 제거 후 블록{} 앞에 -> 추가
	(int a, int b) -> {
		return a > b ? a : b;
	}
	
	// #3 반환값이 있을 경우, 식이나 값만 적고 return문 생략 가능(끝에 세미콜론 안 씀)
	(int a, int b)-> a > b ? a : b
			
	// #4 매개변수의 타입이 추론 가능하면 생략가능
	(a, b)-> a > b ? a : b
			
	//람다식 작성 시 주의사항 		
	// #1 매개변수 하나일 경우, 타입이 없을 때만 괄호() 생략 가능
	(a)-> a + a 
	괄호 생략 =====> a-> a + a 
	(int a)-> a + a 
	괄호 생략 불가능=====> int a-> a + a 
	
	// #2 블록 안 문장이 하나일 경우, 중괄호{} 생략 가능하며 끝에 세미콜론 ; 안 씀
	(int i)-> { System.out.println(i) }
	====> (int i)-> System.out.println(i)
			
	// #3 블록 안 문장이 한 개이지만 return문이면 중괄호{} 생략 불가
	(int a, int b)-> {return a > b ? a : b; } //가능
	(int a, int b)-> return a > b ? a : b  //에러
	
	*/
}
