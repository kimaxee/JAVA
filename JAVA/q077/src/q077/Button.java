package q077;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(Button.OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {	
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
