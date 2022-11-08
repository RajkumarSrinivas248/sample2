package Project;

public class Usecar {

	public static void main(String[] args) {
		Battery b=new Battery("Exide",5000,16.5f);
		Car c=new Car("Honda",2000000,b);
		System.out.println(c);
		
		// TODO Auto-generated method stub

	}

}
