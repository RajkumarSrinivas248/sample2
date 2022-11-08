package Project;

public class Car {
	private String brand;
	private int price;
	private Battery battery;
	public Car(String brand,int price,Battery battery) {
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}
	
	public String toString() {
		return brand+" "+price+" "+battery;
	}
	

}
