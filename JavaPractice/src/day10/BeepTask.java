package day10;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep(); //비프음 발생
			try {
				Thread.sleep(500); //0.5초간 일시 정지
			} catch (Exception e) {
				
			}

		}
	}
}
