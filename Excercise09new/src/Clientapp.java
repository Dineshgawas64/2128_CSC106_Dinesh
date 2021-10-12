
public class Clientapp {

	public static void main(String[] args) {
		
		Simple S= new Simple();
		S.add(20, 10);
		S.subract(20, 10);
		S.multiply(20, 10);
		S.divide(20, 10);
		System.out.println("\n");
		
		Advanced A = new Advanced();
		A.add(30, 5);
		A.subract(30, 5);
		A.multiply(30, 5);
		A.divide(30, 5);
		A.modulus(30, 7);
		A.square(13);
		A.sqrt(68);
		System.out.println("\n");
		
		//polymorphic
		A.add(20, 34, 37);
	}

}
