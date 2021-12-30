package review;

import java.util.Arrays;

public class Ex5_1_tmp {

	public static void main(String[] args) {
//		int[] score;    	//배열 score 선언(참조변수 생성)
//		score = new int[5];	//배열의 생성(int 저장공간 x 5)
		
//		int[] score = new int[5];
//		score[3] = 100;
//		
//		System.out.println("score[0]=" + score[0]);
//		System.out.println("score[1]=" + score[1]);
//		System.out.println("score[2]=" + score[2]);
//		System.out.println("score[3]=" + score[3]);
//		System.out.println("score[4]=" + score[4]);
		
//		int[] arr = new int[10]; 
//		System.out.println("arr.length= " + arr.length);
//		
//		for(int i=0; i<10; i ++) {
//			System.out.println("arr[" + i + "]= " + arr[i]);
//		}
		
		int[] iArr = {100, 95, 80, 70, 60};
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		//배열을 문자열로 보여줌 
		System.out.println(Arrays.toString(iArr)); //결과: [100, 95, 80, 70, 60]
		
		//character형일 경우에만 println()함수 사용하면 문자들이 나옴
		char[] chArr = {'a', 'b', 'c', 'd' };
		System.out.println(chArr); //결과: abcd
		
		
	}
	
}
