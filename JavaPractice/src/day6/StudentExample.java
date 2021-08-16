package day6;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name: " + student.name); //부모클래스로부터 상속받은 필드 출력
		System.out.println("ssn: " + student.ssn);   //부모클래스로부터 상속받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);
	}
}
