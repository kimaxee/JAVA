package q114;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//p.566 예제
public class DateTimeFormatExample {		// 포맷팅 문자열

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}

}
