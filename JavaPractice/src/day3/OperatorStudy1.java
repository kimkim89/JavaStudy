package day3;

public class OperatorStudy1 {

	public static void main(String[] args) {
		
		//20210814 백기선-자바스터디 Practice
		int start = 2_000_000_000;
		int end = 2_100_000_000;
		
		// 가운데 값 구하기
		//int mid = (start + end) / 2;  //오버플로우 발생 가능성 있음
		
		/*	#1 예시 : 
		  	오버플로우 발생하지 않게 코딩 할 경우 연산 순서: 
		  	(1) (end - start) 
		  	(2) (end - start) / 2
		  	(3) start + (end - start) /2 
		 */
		int mid = start + (end - start) /2; 
		System.out.println(mid);
		
		/*
		 	비트연산자 >>>1 을 사용하면 2로 나누는 것과 같음
		 */
		int mid2 = (start + end) >>> 1;
		System.out.println(mid);
		

	}

}
