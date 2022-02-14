package q081;

//p.444 ~ 445, 447 예제
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
