package day10;

import javax.swing.JOptionPane;

public class InterruptPractice {
	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		System.out.println("isInterrupted(): " + th1.isInterrupted());  // false	
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt(); // interrupt()를 호출하면, interrupted상태가 true가 됨.
//		System.out.println("isInterrupted(): " + th1.isInterrupted());  // true		
//		// main쓰레드가 interrupt 되었는지 확인
//		System.out.println("isInterrupted(): " + Thread.interrupted());  // false, static메소드라서 Thread클래스명으로 호출		
	}
}

class ThreadEx1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++) {} // 시간 지연
		}
		System.out.println("isInterrupted(): " + this.isInterrupted()); // true, this 생략 가능
		System.out.println("isInterrupted(): " + this.isInterrupted()); // true, this 생략 가능
		// isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 false로 초기화 시킴
		System.out.println("isInterrupted(): " + Thread.interrupted()); // true, Thread클래스명 생략 가능
		System.out.println("isInterrupted(): " + Thread.interrupted()); // false, Thread클래스명 생략 가능
		
		
		System.out.println("카운트가 종료되었습니다.");
	}
}