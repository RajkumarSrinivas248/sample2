package Project;

public class Useemployee {

	public static void main(String[] args) {
		Employee e1=new Employee("Deepan",20,"Admin",20000);
		Employee e2=new Employee("Ragav",15,"Associate",15000);
		Employee e3=new Employee("paul",10,"Manager",50000);
		Employee e4=new Employee("Raj",5,"Staff",12000);
		Employee e5=new Employee("Lokesh",3,"seniorAssociate",30000);
		
		Employee[]es={e1,e2,e3,e4,e5};
		int max=0;
		int index=0;
		for(int i=0;i<es.length;i++) {
			if(es[i].getSalary()>=max) {
				max=es[i].getSalary();
				index=i;
			}
		}
			
			System.out.println(es[index].getName()+" "+es[index].getDepaartment()+" "+es[index].getId()+" "+es[index].getSalary());
			
		}
		
		// TODO Auto-generated method stub

	}


