package day8;

public class Cat implements Animal{

	@Override
	public String getName() {
		return "고양이";
	}

	@Override
	public int getLegs() {
		return 4;
	}
	
}
