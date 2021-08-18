package day8;

//예제 출처: https://dahyeee.tistory.com/entry/JAVA-interface-default-static%EB%A9%94%EC%86%8C%EB%93%9C
public interface Calculator {
	
	//추상 메소드 역할(abstract가 생략되어 있음)
	public int plus(int pre, int post);
	public int multi(int pre, int post);
	
	//Java 8부터 기본 메소드(default 메소드) 사용 가능
	default int execPlus(int pre, int post) {
		return pre + post;
	}
	
	//Java 8부터 static 메소드 사용 가능
	static int execMulti(int pre, int post) {
		return pre * post;
	}
}
