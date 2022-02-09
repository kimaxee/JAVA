package test;

public class Drink extends Product{
	public boolean isHot = false; 
	public Drink(String name, int price, int id) {
		super(name,price,id);
	}
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
	
}
