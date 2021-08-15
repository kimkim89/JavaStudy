package day4;

import java.util.Arrays;

public class ControlLoopPractice1 {

	public static void main(String[] args) {
		/*int i = 0;
		
		while(i<5) {
			System.out.println("while문 " + (i + 1) + "번째 반복 실행 중");
			i++; //증가시키지 않으면 i는 계속 0이라서 while문 무한 루프 상태가 됨
		}
		
		
		String[] fruitName = new String[] {"Apple", "Blueberry", "Cherry", "Peach", "Grapes"}; 
		String[] customerName = new String[] {"Jane", "Hailey", "Henry"};
		//int[] intNum = new int[] { 1, 2, 3, 4, 5 };
		
		
		int[] intNum = new int[10];		
		
		for(int j=0; j<intNum.length; j++) {			
			intNum[j] = j+1; 				//intNum배열의 index별로 1~10을 저장
			System.out.println(intNum[j]); 	//intNum배열 내부 값 출력	
		}*/
		
		/*int a = 1, b = 1;
		while (a < 1 ) {
			System.out.println("while문이 " + a + "번째 반복 실행 중");
			a++;
		}
		System.out.println("a값: " + a + "입니다.");
		
		do { 
			System.out.println("do / while문 " + a + "번째 반복 실행 중");
			b++;
		} while( b < 1);
			System.out.println("while문 종료 후 b: " + b + ""); */
		
		
		/*
		int[] arr1 = new int[] {1,2,3,4,5};
		int newLen = 10;
		
		//배열 복사 후 for문으로 출력 
		// 1. System클래스의 arraycopy() 메소드
		int[] arr2 = new int[newLen];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int a=0; a<arr2.length; a++) {
			System.out.println(arr2[a] + " "); // 결과: 1~5, 0, 0, 0, 0, 0
		}
		System.out.println();
		
		// 2. Arrays 클래스의 copyOf() 메소드 사용
		int[] arr3 = Arrays.copyOf(arr1, 10);
		
		for(int b=0; b<arr3.length; b++) {
			System.out.println(arr3[b] + " "); // 결과: 1~5, 0, 0, 0, 0, 0
		}
		System.out.println();
		
		// 3. Object 클래스의 clone() 메소드
		int[] arr4 = (int[])arr1.clone();
		
		for(int c=0; c<arr4.length; c++) {
			System.out.println(arr4[c] + " "); // 결과: 1~5
		}
		System.out.println();
		
		// 4. for문과 인덱스를 이용한 복사
		int[] arr5 = new int[newLen];
			
		for(int d=0; d<arr3.length; d++) {
			System.out.println(arr2[d] + " "); // 결과: 1~5, 0, 0, 0, 0, 0
		}
		System.out.println();*/
		
		/*int[] arr = new int[] {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num + " "); // 결과: 1,2,3,4,5
		}*/
		
		
		// continue문 예제
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { // 짝수가 아닐 경우 하단의 실행문 실행되지 않고 다시 증감식으로 이동
				continue;
			}
			System.out.println(i);  // 짝수만 출력됨: 2,4,6,8,10
		}
		
		// break문 예제
		while(true) {
			int number = (int) (( Math.random() * 100 ) + 1); // 1 ~ 100까지의 랜덤 숫자가 number 변수에 저장됨
			System.out.println(number);
			if(number == 100) {  // number가 100일 경우 break문 실행됨
				break;
			}
		}
		
		
	
		
	}
}
