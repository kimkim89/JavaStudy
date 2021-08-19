package day9;

public class TryCatchFinallyRuntimeException {
	public static void main(String[] args) {
		String data1= null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		
		/* 	다중 catch 블록 작성 시 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 함.
		 	이유: 예외 처리 catch 블록은 위에서부터 차례대로 검색되므로
		  		 Exception 예외 처리 try문이 먼저 실행되면 하위 예외 클래스의 catch블록은 실행 안됨
		 */	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족함.");
			return;
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없음");
		}catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
