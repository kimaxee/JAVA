package pExample;

import q073.Audio;

//p.348 ~ 362 예제
public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl rc;
		SmartTelevision st;
		RemoteControl.changeBattery();
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		st = new SmartTelevision();
		st.turnOn();
		st.search("DAUM");
		st.setVolume(5);
		st.setMute(true);
		st.setMute(false);
		st.turnOff();
		
	
	}

}
