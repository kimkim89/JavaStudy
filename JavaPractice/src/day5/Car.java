package day5;

public class Car { //클래스명
	private String modelName; //필드
	private int modelYear;	  //필드
	
	Car(String modelName, int modelYear) { //생성자
		this.modelName = modelName;
		this.modelYear = modelYear;		
	}
	
	public String getModel() { //메서드
		return this.modelYear + "년식 " + this.modelYear;
	}

	
	
	/* 	반환타입 메서드이름(타입 변수명, 타입 변수명, ...) {
	  	// 메서드 호출 시 수행될 코드	  
	  	}
	  	
	  	int add(int a, int b) //선언부
	 	블록{ } 내부 	// 구현부 
	 	
	 	**반환타입이 없을 경우, void 사용
	 */
	
	int add(int a, int b) //선언부
	{
		int result = a + b;
		return result; 	// 호출한 메서드로 결과 반환
	}
}
