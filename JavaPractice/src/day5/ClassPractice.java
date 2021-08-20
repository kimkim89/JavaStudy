package day5;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassPractice {
	public static void main(String[] args) {
		Button b = new Button("Start");
		//b.addActionListener(new EventHandler()); // new EventHanlder를 익명클래스로 변경
		b.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) { //상속받은 인터페이스 이름이로 익명클래스 정의하고 객체 생성함
				System.out.println("ActionEvent occurred.");				
			}
		});		
	}
}

/*class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred.");		
	}
}*/
