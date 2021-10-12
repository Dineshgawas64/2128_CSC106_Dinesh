
public class Hairstylist extends Staff {
	

	
	public Hairstylist(String name,String profession,  int salary, int staff_id) {
		super(name,profession,salary, staff_id);
		
	}
	
	public void displayHS()
	{
		System.out.println(name + profession + salary + staff_id);
	}
}
