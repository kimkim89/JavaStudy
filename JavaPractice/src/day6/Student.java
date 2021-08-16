package day6;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		
		/* [MEMO]
		 * ※ 자식 객체 생성 시 부모 객체가 먼저 생성된 후 자식 객체가 생성됨.
		 * 
		 * 부모 클래스에 생성자를 작성하지 않으면, 컴파일러가 기본 생성자를 자동 추가 해줌.
		 * 만약 부모 클래스에 매개값이 전달받은 부모 생성자만 존재한다면, 컴파일러는 부모의 기본 생성자를 자동 추가하지 않음. 
		 * --> 그래서 자식 생성자에서 부모 생성자를 호출하려면 super(매개값,...);을 사용하여 명시적으로 호출해야함.
		 * */	
		
		super(name, ssn);  // 부모(People) 생성자 호출, People클래스에 name과 ssn 매개값을 받는 생성자가 존재하므로 매개값 필수
		this.studentNo = studentNo;
	}
}
