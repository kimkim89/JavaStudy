package day2;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] greetings = {"Hello", "안녕", "你好", "Hola"};
		
		String[] season = new String[4];			
			
		for(int i=0; i<season.length; i++) {
			//System.out.println(season[i]);
		}
		
		season[0] = "spring";
		season[1] = "summer";
		season[2] = "autumn";
		season[3] = "winter";			
		
		for(int i=0; i<season.length; i++) {
			//System.out.println(season[i]);
		}
		
		int number[];
		number = new int[8];

		
		String[] subject;
		subject = new String[] {"English", "Math", "Science", "History", "Music"};
		
		int j = 0;
		while(j<subject.length) {
			System.out.println(subject[j]);
			j++;
		}
		
		
		
	}

}
