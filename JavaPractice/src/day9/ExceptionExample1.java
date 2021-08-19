package day9;

public class ExceptionExample1 {
	public static void main(String[] args) {
		
		/*try {
			// 여기서 호출하는 메서드가 어떤 예외를 던지냐에 달렸음
			throw new NullPointerException;			
		// catch 조건식에 하단의 코드처럼 상속 관계인 예외 클래스가 있다면 에러 발생
		} catch (RuntimeException | ClassCastException e) {
			System.out.println(e.getMessage());
		} */
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getClass());
		}
		
	}
}
