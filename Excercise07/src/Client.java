
public class Client {

	public static void main(String[] args) {
		

		//Smart phone objects
				smartphone sp1 = new smartphone();
				smartphone sp2 = new smartphone();
				
				//Black&white featured Phone object
				black_white_phone bf1 = new black_white_phone();
				black_white_phone bf2 = new black_white_phone();
				
				
				//Smart enabled phone
				smart_enabled_phone sep1 = new smart_enabled_phone();
				smart_enabled_phone sep2 = new smart_enabled_phone();
				
				mobilephone[] mobilephones = {sp1, sp2, sep1, sep2, bf1, bf2};
				
				System.out.println("****** Smart Phone ******");
				for( int i = 0; i < mobilephones.length; i++) {
					mobilephones[i].start_phone();
				}
				
				
				
				feature_phone[] featurephones = {bf1, bf2, sep1, sep2};
				System.out.println("\n****** FEATURED PHONE ******");
				for( int i = 0; i < featurephones.length; i++) {
					featurephones[i].setPolyphonicRingtone();
				}
	}

}
