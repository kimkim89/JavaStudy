package day5;

class Data_1 { 
	// 클래스 내부에 생성자가 하나도 없다면, 컴파일러가 자동으로 기본생성자를 추가해줌
	// Data_1(){ } // 기본생성자를 추가한다면 좌측처럼 추가!
	int value;
}

class Data_2 {
	int value;
	
	/* 클래스 내부에 생성자가 하나라도 있다면, 컴파일러는 자동으로 기본생성자를 추가하지 않음 */
	// Data_2(int x ){ }는 생성자 오버로딩임
	Data_2(){ } // 기본 생성자
	Data_2(int x){ // 매개변수가 있는 생성자
		value = x;
	}
}

/* 객체가 생성되면서 객체 초기화 되는 방법: 
 * 		Car c = new Car("Blue", "auto", 4);
 * 		1. Car c ==> 참조변수 c가 만들어짐
 * 		2. new 	 ==> new연산자가 객체를 3개 만듬 
 * 		3. Car("Blue", "auto", 4); ==> 생성자 호출하면서 객체 초기화(세팅) 시킴
 * 
 * */

class ConstructorPractice1 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error 발생
		//The constructor Data_2() is undefined
	}
	
}
