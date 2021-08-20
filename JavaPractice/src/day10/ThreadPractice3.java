package day10;

// 2개의 쓰레드를 실행시켜서 소요 시간을 재는 예제
public class ThreadPractice3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		TestThread1 th1 = new TestThread1();
		TestThread2 th2 = new TestThread2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다림
			th2.join(); // main쓰레드가 th2의 작업이 끝날 때까지 기다림
		}catch(InterruptedException e){
			
		}
		
		System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
		
	} // main() 끝
}


class TestThread1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(new String("-"));
		}
	} // run() 끝
}

class TestThread2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(new String("|"));
		}
	} // run() 끝
}
