package q092;

//p.509 예제
public class StringToLowerUpperCaseExample {	//전부 소문자 또는 대문자로 변경

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		
		System.out.println(str1.equals(str2));  //false
		
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));  //true
		
		
		System.out.println(str1.equals(str2));  //false
	}

}
