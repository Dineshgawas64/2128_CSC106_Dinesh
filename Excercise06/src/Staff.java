
public abstract class Staff extends User{
	
	String profession;
	
	int salary ;
	
	int staff_id ;

	public Staff(String name,String profession, int salary, int staff_id) {
		super(name);
		this.salary = salary;
		this.staff_id = staff_id;
		this.profession = profession;
	}
	
}
