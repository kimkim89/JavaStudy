package day10;

import java.awt.Toolkit;

//비프 소리 예제
public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep(); //비프음 발생
			try {
				Thread.sleep(500); //0.5초간 일시 정지
			} catch (Exception e) {
				
			}
			
			for(int j=0; j<5; j++) {
				System.out.println("beep");
				try {
					Thread.sleep(500); //0.5초간 일시 정지
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
