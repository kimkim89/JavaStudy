package day2;

public class VariableTest {

	public static void main(String[] args) {
		int a = 10;
		//System.out.println(a);
	
		for(int i=0; i<10; i++) {
			//System.out.println("i = " + i);
		}
		//System.out.println(i);
	
		if(a==10) {
			String str1 = "hello";
			//System.out.println(str1);
		}
			//System.out.println(str1); // 에러발생
	
		int iValue = 129;
		byte bValue = (byte)iValue;

		
		System.out.println(Integer.MAX_VALUE);
		
	}
	
	
	
}



class A {
	int instanceValue; // 인스턴스 변수
	static int classValue; // 클래스 변수(static, 공유 변수)
	
	void method() {
		int localValue = 0; // 지역변수
	}
}