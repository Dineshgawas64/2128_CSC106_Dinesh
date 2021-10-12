
public class Customer extends User {
	
	int cust_id;

	public void customer() {}
	public Customer(String name, int cust_id) {
		super(name);
		this.cust_id = cust_id;
	}

	public void displayuser()
	{
		System.out.println(name + cust_id);
	}
}
	

