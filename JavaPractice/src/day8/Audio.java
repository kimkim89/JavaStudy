package day8;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("AUDIO 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("AUDIO 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 AUDIO 볼륨: " + this.volume);
	}
}
