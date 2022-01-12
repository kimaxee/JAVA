import java.util.Calendar;

// ��8 å ���� p.176
public class q008 {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1(��) ~ 7(��)
		
		
		switch(week) { 
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("���� ����: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
		
		//ordinal() �޼ҵ�
		System.out.println(today.name());
		System.out.println(today.ordinal());
		
		//compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		System.out.println(day1.compareTo(day2));
		System.out.println(day2.compareTo(day1));
		
		//values() �޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
