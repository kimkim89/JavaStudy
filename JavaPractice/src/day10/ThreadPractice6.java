package day10;

public class ThreadPractice6 {
	public static void main(String[] args) {
		ThreadTest6_1 th1 = new ThreadTest6_1();
		ThreadTest6_2 th2 = new ThreadTest6_2();
		
		//th1.setPriority(5); //setPriority()메서드로 쓰레드 우선순위를 지정하지 않아도 기본값이 5
		th2.setPriority(9);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}


class ThreadTest6_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x=0; x<10000000; x++); // 시간지연용 for문
		}
	}
}


class ThreadTest6_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x=0; x<10000000; x++); // 시간지연용 for문
		}
	}
}