package store;

import java.util.Vector;

public class Product {
	String name;
	int price;
	int quantity;
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}
class Commodity{
	
	Vector registration = new Vector<>();
	
	public void inProuct(Product p){
		registration.add(p);
		System.out.println(p+"가 등록되었습니다.");
	}
}