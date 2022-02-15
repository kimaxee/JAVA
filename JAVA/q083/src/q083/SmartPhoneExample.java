package q083;

//p.465 ~ 466 예제
public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		String strObj2 = myPhone.info();
		System.out.println(strObj);
		System.out.println(myPhone);
		System.out.println(strObj2);
	}

}
