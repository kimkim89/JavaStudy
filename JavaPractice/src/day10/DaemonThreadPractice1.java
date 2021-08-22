package day10;

public class DaemonThreadPractice1 implements Runnable{
	static boolean autoSave = false;
	
	/*일반쓰레드*/
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadPractice1()); // Thread(Runnable r)
		t.setDaemon(true); // 이 부분이 없으면 프로그램이 종료되지 않음
		t.start();
		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println(i);
			
			if(i==5) {
				autoSave = true;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	
	
	/*데몬쓰레드*/
	// 일반쓰레드가 하나도 없을 때 데몬쓰레드는 자동종료됨.
	@Override
	public void run() {
		/* 상단의 setDaemon(true)메서드가 없다면 무한루프 종료 안됨.
		 * setDaemon(true)메서드가 있다면 일반쓰레드가 모두 종료되었을 때 데몬쓰레드인 하단의 쓰레드도 종료됨.
		 * */
		while(true) { // 무한루프이지만 main쓰레드(일반쓰레드)가 종료되면서 종료됨
			try {
				Thread.sleep(3 * 1000); // 3초마다
			} catch (InterruptedException e) {}
			
			// autoSave의 값이 true이면 autoSave()메서드 호출
			if(autoSave) { //5초 이전일 경우, autoSave = false이고 5초 이후부터는 autoSave = true가 됨.
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
}


