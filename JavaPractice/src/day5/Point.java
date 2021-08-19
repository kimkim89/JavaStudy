package day5;

import java.lang.reflect.Field;

public class Point {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Field[] declaredFields = Class.forName("day5.Point").getDeclaredFields(); //forName()메소드 사용 시 클래스 로딩해서 해당 클래스 내 정보 꺼낼 수 있음
		for(Field declaredField : declaredFields) {
			System.out.println(declaredField.getName());
		}
	}
	
	
	class InnerPoint {
		int z = 0;
		
		class InnerInnerPoint {
			int aaa =0;
		}
	}
	
	int x;
	
	int y;
	
	int z = 0;
	{
		System.out.println("init block");
		if(x > 1) {
			y = 3;
		}
	}
	
	public Point(int x) {
		System.out.println("constructor");
		this.x = x;
	}
	
	/*public static void main(String[] args) {
		Point p = new Point(3);
		System.out.println(p.y); // y = 0;
	}*/
}
