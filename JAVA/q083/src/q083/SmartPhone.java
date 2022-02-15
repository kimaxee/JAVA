package q083;

//p.465 ~ 466 예제
public class SmartPhone {
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
	
	public String info() {
		return "회사: " + company + " / " + "OS: " + os;
	}
}
