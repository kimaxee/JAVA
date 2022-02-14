package q077;

public class Main {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("전화를 겁니다.");
			}
		});
		
		btn.touch();
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");				
			}
		});

		btn.touch();
	}
}
