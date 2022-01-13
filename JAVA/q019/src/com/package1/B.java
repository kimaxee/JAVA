// p.259~265

package com.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;		// o
		a.field2 = 1;		// o
//		a.field3 = 1;		// x		private 필드 접근 불가(컴파일 에러)
		
		a.method1();		// o
		a.method2();		// o
//		a.method3();		// x		private 메소드 접근 불가(컴파일 에러)
	}
	
	
	
	
//	//필드
//	A a1 = new A(true);		// o
//	A a2 = new A(1);		// o
////	A a3 = new A("문자열");	// x  private 생성자 접근 불가(컴파일 에러)

	
	
	
//	A a;    // 가능
//
////    public
////	protected 
////	private
////    default (안써도 됨)
//	
//	private static B xxx = new B();
//	
//	static B getInstace(){
//		return xxx;
//	}
//	
//	private B() {
//		System.out.println("개");
//	}
}