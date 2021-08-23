package day10;

/*쓰레드 이름을 1초마다 한 번씩 찍는 예제*/
public class ThreadPractice8 {
	public static void main(String[] args) {
		
		MyTestThread th1 = new MyTestThread("*");
		MyTestThread th2 = new MyTestThread("**");
		MyTestThread th3 = new MyTestThread("***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); 
			th1.suspend();		// 쓰레드 th1을 잠시 중단시킴
			Thread.sleep(2000);
			th2.suspend();		
			Thread.sleep(3000);	
			th1.resume();		// 쓰레드 th1이 다시 동작하도록 함
			Thread.sleep(3000);	
			th1.stop();			// 쓰레드 th1을 강제종료시킴
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
}

class MyTestThread implements Runnable{
	volatile boolean suspended = false;  //volatile ==> 쉽게 바뀌는 변수
	volatile boolean stopped = false;
	
	Thread th;
	
	MyTestThread(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	@Override
	public void run() {
		System.out.println("stopped: " + stopped);
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { }
			}			
		}
	}
}
