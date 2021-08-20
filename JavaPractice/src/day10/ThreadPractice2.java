package day10;

public class ThreadPractice2 {
	public static void main(String[] args) {
		/* 싱글 쓰레드 방식  */
		
		for(int i=0; i<5; i++) {
			System.out.println(0); // 조상인 Thread의 getName()을 호출
		}
		
		for(int i=0; i<5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환
			System.out.println(1);
		}
	}
}


