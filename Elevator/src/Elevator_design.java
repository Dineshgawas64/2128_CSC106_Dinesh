
public class Elevator_design {

	public static void main(String[] args) {
		
		
		Elevator e = new Elevator();
		
		e.start_elevator();
		
		System.out.println("displaying external buttons on eleavtor");
		
		Elevator_button eb1 = new External_button("up_button");
		//calls elevator if its below source floor.
		Elevator_button eb2 = new External_button("down_button");
		//calls elevator if its above source floor.
		Elevator_button[] eb = {eb1,eb2};
		
		for(int i=0;i<eb.length;i++) {
			eb[i].display_button();
		}

							
		System.out.println("displaying internal buttons on eleavtor");
		
		Elevator_button nb1 = new Number_buttons("1");
		Elevator_button nb2 = new Number_buttons("2");
		Elevator_button nb3 = new Number_buttons("3");
		Elevator_button nb4 = new Number_buttons("4");
		Elevator_button nb5 = new Number_buttons("5");
		Elevator_button nb6 = new Number_buttons("6");
		//...
		
		Elevator_button[] nb = {nb1,nb2,nb3,nb4,nb5,nb6};
		
		for(int j=0;j<nb.length;j++) {
			nb[j].display_button();
		}
		
		Elevator_button ob1 = new Other_buttons("up_button");
		Elevator_button ob2 = new Other_buttons("down_button");
		Elevator_button ob3 = new Other_buttons("door_open");
		Elevator_button ob4 = new Other_buttons("door_close");
		Elevator_button ob5 = new Other_buttons("emergenct_stop");
		Elevator_button ob6 = new Other_buttons("emergency_alarm");
		
		Elevator_button[] ob = {ob1,ob2,ob3,ob4,ob5,ob6};
		
		for(int k=0;k<ob.length;k++) {
			ob[k].display_button();
		}
		
		
		e.stop_elevator();
	}

}
