package ex;

import java.io.Serializable;

public class Fluit implements Serializable {
	private String name;
	private int price;
	
	public Fluit() {}
	public Fluit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
