package q086;

//p.486 예제
public class SystemTimeExample {		//프로그램 실행 소요 시간 구하기
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		
		int sum = 0;
		for(int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		
		long time2 = System.nanoTime();
		
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}