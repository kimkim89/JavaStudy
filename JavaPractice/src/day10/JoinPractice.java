package day10;

public class JoinPractice {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx11 th1 = new ThreadEx11();
		ThreadEx22 th2 = new ThreadEx22();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis(); // 시작시간
		
		try {
			th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다림.
			th2.join(); // main쓰레드가 th2의 작업이 끝날 때가지 기다림.
		} catch (InterruptedException e) { }
		
		System.out.print("소요시간: " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx11 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	} // run()메소드 끝
}

class ThreadEx22 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()메소드 끝
}