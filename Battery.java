package Project;

public class Battery {
	private String brand;
	private int price;
	private float volt;
	public Battery(String brand,int price,float volt) {
		this.brand=brand;
		this.price=price;
		this.volt=volt;
		
	}
	public String toString() {
		return brand+" "+price+" "+volt;
	}
	

}
