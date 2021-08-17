package day6;

public abstract class Animal { //추상 클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //추상 메서드
}
