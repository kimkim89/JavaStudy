package review;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // 0~9 중 하나의 값을 임의로 얻어 변수 n에 저장
			int tmp = numArr[0];
			numArr[0] = numArr[n];
//			System.out.println("n= " + n + " , numArr = " + numArr[0]);
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	
	
	
		String[] strArr = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(strArr));
	
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]); // 0~2
		}
	
	
	
	
	
	}

}
