package Project;

public class Onesoft implements Company {
	
	public String name() {
		return "Deepan";
	}
	
	public int noOfemployee() {
	return 45;
	
	}
	public String location() {
		return "Chennai";
	}
	public void expricence(int exp) {
		if(exp>=0&&exp<1) {
			System.out.println(10000);
		}
		else if (exp>=2&&exp<3) {
			System.out.println(20000);
		}
	else if(exp>=3&&exp<4) {
		System.out.println(30000);
	}
	else if(exp>=4&&exp<5) {
		System.out.println(50000);
	}
		
	}
}


