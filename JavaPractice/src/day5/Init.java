package day5;

public class Init {
	private int number;
	
	{ 
		this.number = 10;
		System.out.println("init block");
	}
	
	public Init(int number) {
		//this();  //Init() 기본 생성자를 호출하기 위한 this();는 생략되어 있음
		this.number = number;
	}
	
	
	
	public Init() {
		this.number = 100;
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		Init init = new Init();
		System.out.println(init.number);
	}
}
