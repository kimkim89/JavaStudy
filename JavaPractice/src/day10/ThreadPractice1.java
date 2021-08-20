package day10;

public class ThreadPractice1 {
	public static void main(String[] args) {
		/* 멀티 쓰레드 방식: 2개의 쓰레드 t1과 t2를 실행  */
		
		// ↓ Thread 클래스를 상속해서 쓰레드를 구현할 경우 
		ThreadTest1 t1 = new ThreadTest1(); 
		
		// ↓ Runnable 인터페이스를 구현해서 쓰레드를 구현할 경우
		Runnable r = new ThreadTest2();
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
		
		t1.start();	// 0을 출력
		t2.start();	// 1을 출력
	}
}


class ThreadTest1 extends Thread { // Thread 구현 방법1: Thread클래스를 상속해서 쓰레드를 구현
	public void run() {  // 쓰레드가 수행할 작업을 작성
		for(int i=0; i<10; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출, "this."은 생략 가능
		}
	}
}


class ThreadTest2 implements Runnable { // Thread 구현 방법2: Runnable 인터페이스를 구현해서 쓰레드 구현

	@Override
	public void run() {
		for(int i=0; i<5; i++) {  // 쓰레드가 수행할 작업을 작성
			// Thread.currentThread() - 현재 실행중인 Thread를 반환
			System.out.println(Thread.currentThread().getName()); // currentThread()메서드를 통해 Thread객체를 참조
		}
	}
	
}

