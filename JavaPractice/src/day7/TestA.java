package day7;

public class TestA {
	//필드
	TestA t1 = new TestA(true);
	TestA t2 = new TestA(1);
	TestA t3 = new TestA("테스트");
	
	//생성자
	public TestA(boolean b) {};
	TestA(int b) {};
	private TestA(String s) {};
}
