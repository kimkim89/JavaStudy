package day9;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			/*
			 	java.lang.String2라는 클래스는 존재하지 않으므로
			 	try-catch문을 작성하지 않을 경우에 ClassNotFoundException 예외가 발생.
			 	
			 	Class.forName() 메소드 : 매개값으로 주어진 클래스가 존재할 경우 해당 클래스 객체 리턴, 
			 	없을 경우 ClassNotFoundException 발생.
			 */
			Class clazz = Class.forName("java.lang.String2");
			
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
