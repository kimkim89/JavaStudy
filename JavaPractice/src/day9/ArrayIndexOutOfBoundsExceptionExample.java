package day9;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//args라는 매개값이 주어지지 않았기 때문에 ArrayIndexOutOfBoundsException 발생
		//해결방법: 이클립스 - Run -> Run Configurations -> Arguments탭 -> Program arguments 입력란에 매개값으로 배열 인덱스 추가하면 됨
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}else {
			System.out.println("2 개의 실행 매개값이 필요함");
		}
		
	}
}
