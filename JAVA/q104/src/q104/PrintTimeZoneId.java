package q104;

import java.util.TimeZone;

//p.542 예제
public class PrintTimeZoneId {		//사용 가능한 시간대 문자열 출력

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}

}
