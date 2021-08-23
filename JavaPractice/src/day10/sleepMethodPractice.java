package day10;

public class sleepMethodPractice {
	public static void main(String[] args) {
		ATest th1 = new ATest();
		BTest th2 = new BTest();
		th1.start();
		th2.start();
		
		/* 하단의 try-catch문은 매번 작성하기 불편해서 delay()라는 메소드를 임의로 만듬
		 * try {
			//th1.sleep(2000);  //메인스레드가 아닌 다른 ATest 스레드를 잠들게 할 수 없으며, 해당 코드 실행 시 sleep()메소드가 있는 메인 스레드가 2초 뒤 잠듬
			Thread.sleep(2000); //static 메소드인 sleep()메소드는 클래스명으로 호출해야 함.			
		} catch (InterruptedException e) {} */
		
		/*delay()메소드 추가*/
		delay(2*1000);		
		
		System.out.println("<<main 종료>>");
	} // main()메소드 종료

	/*delay()메소드 추가*/
	static void delay(long millis) {
		try {			
			Thread.sleep(millis); //static 메소드인 sleep()메소드는 클래스명으로 호출해야 함.			
		} catch (InterruptedException e) {} 
	} // delay()메소드 끝
}

class ATest extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) { System.out.print("-"); }
			System.out.print("<<th1 종료>>");
	} // run()메소드 끝
}

class BTest extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) { System.out.print("|"); }
			System.out.print("<<th2 종료>>");
	} // run()메소드 끝
}
