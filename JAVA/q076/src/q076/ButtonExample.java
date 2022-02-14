package q076;

//p.402 ~ 403 예제
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
