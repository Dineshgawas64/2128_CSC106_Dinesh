public class client {

	public static void main(String[] args) {
		
		
		//parameters(name,id)
	Customer c1 = new Customer("john", 1 );
	Customer c2 = new Customer("rone", 2 );
	Customer c3 = new Customer("harry", 3 );
	Customer c4 = new Customer("peter", 4 );
	
	Customer[] userlist = {c1,c2,c3,c4};
	
	
		for(int i=0;i<userlist.length;i++)
		{
		
			userlist[i].displayuser();
	
		}
	
	
	//parameters(name,profession,salary,id)	
	Multi_functional_staff mfs1 = new Multi_functional_staff("ramsey  ","attendant  ",10000,101);
	Multi_functional_staff mfs2 = new Multi_functional_staff("paul","cleaner1",7000,102);
	Multi_functional_staff mfs3 = new Multi_functional_staff("mike","Helper",8000,103);
	Multi_functional_staff mfs4 = new Multi_functional_staff("jemmy","cleaner2",7000,104);
	
	
	
	Multi_functional_staff[] MFSlist = {mfs1,mfs2,mfs3,mfs4};
		
		for(int j=0;j<MFSlist.length;j++)
		{
		
			MFSlist[j].displayMFS();
		}
	
	//parameters(name,profession,salary,id)
	Hairstylist HS1 = new Hairstylist ("a","a",1,2);	
	Hairstylist HS2 = new Hairstylist ("a","a",1,2);
	Hairstylist HS3 = new Hairstylist ("a","a",1,2);
	
	Hairstylist[] HS = {HS1,HS2,HS3};
	
	
	for(int K=0;K<HS.length;K++)
	{
	
		userlist[K].displayuser();

	}
	}

}
