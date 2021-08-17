package day7;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton; // Singleton 객체를 반환
	}
	
	
}
