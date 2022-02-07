package q048;

//p.322 ~ 324 예제
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
