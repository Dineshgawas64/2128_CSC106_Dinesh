
public class Simple extends Calculator{

	@Override
	public int add(int x, int y) {
		int z= x+y;
		System.out.println("Addition in simple calci is-->" +z);
		return z;
	}

	@Override
	public int subract(int x, int y) {
		int z= x-y;
		System.out.println("subraction in simple calci is-->" +z);
		return z;
	}

	@Override
	public int multiply(int x, int y) {
		int z= x*y;
		System.out.println("Multiplication in simple calci is-->" +z);
		return z;
	}

	@Override
	public int divide(int x, int y) {
		int z= x/y;
		System.out.println("Division in simple calci is-->" +z);
		return z;
	}

	

}
