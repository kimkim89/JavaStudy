package day10;

import javax.swing.JOptionPane;

// 싱글쓰레드 예제
// 싱글쓰레드이므로 사용자로부터 값을 입력받지 못하면 하단의 카운트다운 부분은 실행되지 않음
public abstract class ThreadPractice5_2 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초간 시간을 지연한다.
			}catch(Exception e) {}
		}
	}
}
