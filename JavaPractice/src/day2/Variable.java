package day2;

import java.math.BigDecimal;

public class Variable {

	public static void main(String[] args) {
		//String은 Reference Type
		/*
		 * String 타입 변수에 동일한 문자열 literal 저장 시, Heap영역에 해당 문자열이 있다면 동일한 문자열을 참조
		 * new 키워드 사용 시 "Hello"라는 문자열이 새롭게 Heap 영역에 저장되므로, 각각 다른 주소값을 가리킴
		 * */
		//예제1
		/*String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);

		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s3 == s4);*/
		
		
		//예제2
		/*float fnum = 0f;
		for(int i=0; i<10; i++) {
			fnum += 0.1f;
		}
		System.out.println(fnum); //결과: 1.0000001
		
		BigDecimal fbnumber = BigDecimal.ZERO; //fbnumber 출력 시 0이 출력됨
		for(int i=0; i<10; i++) {
			fbnumber = fbnumber.add(BigDecimal.valueOf(0.1)); // fbnumber.add(BigDecimal.valueOf(0.1));를 하더라도 fbnumber 객체에 따로 저장한 후 출력하지 않으면 0으로 뜸 
		}
		System.out.println(fbnumber); //결과: 1.0
		
		*/
		
		
		
		
		/*
		 예제3: 
			  하단 코드 에러나는 이유: 
			 1. Static이 올라가는 시점은 클래스 로딩할 때
			 2. 인스턴스 메서드가 만들어지고 처리되는 시점은 instance를 new해서 만든 다음이기 때문
			 => 즉, 로딩하는 시점이 다르기 때문에 참조할 수 없음		 		 
		 */
		/*private static int num = helloNumber();
		
		private int helloNumber() {
			return 10; // return값은 instance
		}*/
		
		/*예제4: 
			 반대로, instance에서는 클래스 타입을 참조할 수 있음
		 	 이유: 클래스 타입은 만드는 시점에 이미 로딩됐기 때문
		*/
		/*private static int number = 100;
		
		private int helloNumber1() {
			return Variable.number;
		}*/
		
		
		
		
		
		
	}

}
