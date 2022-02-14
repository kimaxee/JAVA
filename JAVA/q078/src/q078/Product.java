package q078;

public class Product {
	private int id;
	private int price;
	private String name;
	
	public Product(String name, int price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public void info() {
		System.out.println("[" + id + "] " + name + " " + price + "원");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
	
