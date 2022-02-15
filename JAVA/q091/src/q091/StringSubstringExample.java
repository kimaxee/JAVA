package q091;

//p.507 ~ 507 예제
public class StringSubstringExample {		//문자열 추출하기

	public static void main(String[] args) {
		String ssn = "880815-1234567";			// 880815-1234567
												// 01234567891111	
												//			 0123
		
		String firstNum = ssn.substring(0, 6); //0(포함) ~ 6(제외) 라서 - 가 제외됨
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);  //인덱스 7부터의 문자열 추출
		System.out.println(secondNum); 
	}

}
