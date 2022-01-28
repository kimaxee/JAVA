package q044;


// p.294 ~ 295 예제
public class StudentExample {
	public static void main(String[] args) {
		Student studet = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name: " + studet.name);
		System.out.println("ssn: " + studet.ssn);
		System.out.println("studentNo : " + studet.studentNo);
	}
}
