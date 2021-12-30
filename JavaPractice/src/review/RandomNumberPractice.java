package review;

public class RandomNumberPractice {
	
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*10)); // 0<= X < 10, 0~9
//			System.out.println((int)(Math.random()*10)+1); // 1<= X < 11, 1~10
			System.out.println((int)(Math.random()*11)-5); // -5 ~ 5
		}
	}
	
}
