package day10;

import javax.swing.JOptionPane;

// 멀티쓰레드 예제
// 멀티쓰레드이므로 사용자로부터 값을 입력받지 못해도 하단의 카운트다운 부분은 동시에 실행됨
// 카운트다운이 끝나도 입력값이 들어오지 않으면 프로그램은 종료되지 않음. 입력값이 들어와야 프로그램 종료됨.
public abstract class ThreadPractice5_1 {
	public static void main(String[] args) {
		
		TestThreadA th1 = new TestThreadA();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");		
	}
}

class TestThreadA extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초간 시간을 지연한다.
			}catch(Exception e) {}
		}
	}
}
