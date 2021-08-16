package day6;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); // 추상클래스인 Phone클래스는 객체 생성 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}
