package day8;

public class RemoteControlExample {
			
	public static void main(String[] args) {
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();	
		
		rc1.turnOn();
		rc1.setVolume(9);
		rc1.turnOff();
		
		System.out.println();
		
		rc2.turnOn();
		rc2.setVolume(8);
		rc2.turnOff();
	}
}
