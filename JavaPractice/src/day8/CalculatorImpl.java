package day8;

//예제 출처: https://dahyeee.tistory.com/entry/JAVA-interface-default-static%EB%A9%94%EC%86%8C%EB%93%9C
public class CalculatorImpl implements Calculator{

	@Override
	public int plus(int pre, int post) {
		return pre + post;
	}

	@Override
	public int multi(int pre, int post) {
		return pre * post;
	}
	
}
