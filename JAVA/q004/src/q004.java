
// 문4 책 예제 p.148
public class q004 {
	public static void main(String[] args) {
				String strVar1 = "신민철";
				String strVar2 = "신민철";
				
				
				if(strVar1 == strVar2) {
					System.out.println("strVar1과 strVar2는 참조가 같음");
				} else {
					System.out.println("strVar1과 strVar2는 참조가 다름");
				}
				
				
				if(strVar1.equals(strVar2)) {
					System.out.println("strVar1과 strVar2는 문자열이 같음");
				}
				
				
				String strVar3 = new String("신민철");
				String strVar4 = new String("신민철");
				
				
				if(strVar3 == strVar4) {
					System.out.println("strVar3과 strVar4는 참조가 같음");
				} else {
					System.out.println("strVar3과 strVar4는 참조가 다름");
				}
				
				
				if(strVar3.equals(strVar4)) {
					System.out.println("strVar3과 strVar4는 문자열이 같음");
				} 
				System.out.println(System.identityHashCode(strVar1));  //객체 주소 확인
				System.out.println(System.identityHashCode(strVar2));
				System.out.println(System.identityHashCode(strVar3));
				System.out.println(System.identityHashCode(strVar4));
	}

}
