public class Advanced extends Calculator{
	


	@Override
	public int add(int x, int y) {
		int z=x+y;
		System.out.println("Addition in advanced calci is-->" +z);
		return z;
	}

	@Override
	public int subract(int x, int y) {
		int z=x-y;
		System.out.println("Subraction in advanced calci is-->" +z);
		return z;
	}

	@Override
	public int multiply(int x, int y) {
		int z=x*y;
		System.out.println("Addition in advanced calci is-->" +z);
		return z;
	}

	@Override
	public int divide(int x, int y) {
		int z=x/y;
		System.out.println("Division in advanced calci is-->" +z);
		return z;
	}
	
	public int modulus(int x,int y) {
		int z=x%y;
		System.out.println("Modulus in advanced calci is-->" +z);
		return z;
	}
	
	public int square(int x) {
		int z=x*x;
		System.out.println("Square in advanced calci is-->" +z);
		return z;
	}
	
	public double sqrt(int x) {
		double z= Math.sqrt(x);
		System.out.println("Square root in advanced calci is-->" +z);
		return z;
	}
	
	 public int add(int x,int y, int w)
	 {
		 int z = x + y + w;
		 System.out.println("Addition in advanced calci is-->" +z);
		 return z;
	 }

}





// polymorphism

