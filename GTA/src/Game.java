import com.Dinesh.csc106.prac14.ppl.Citizen;
import com.Dinesh.csc106.prac14.ppl.Player;
import com.Dinesh.csc106.prac14.travel.Cycle;
import com.Dinesh.csc106.prac14.travel.Fast_car;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p = new Player("Rohan ", "Dark ", "Spike ", "Formal_clothes");
		Citizen c = new Citizen("Citizen1", "free", "walk_fast");
	
		
		System.out.println("player info :: " + p.getPlayer_name() + p.getSkin_colour() + p.getHair_style() + p.getClothing());
		System.out.println("citizen info is : " + c.getName()+ " " + c.getRole() + " " + c.getStyle());
		
		Cycle cyc = new Cycle("cycle1 ", "travel_slow ", 1);
		Fast_car fc = new Fast_car("fast_car1 ", "travel_fast ", 2, 100);
		
		System.out.println("cycle info:: " + cyc.getName() + "role=" + cyc.getRole()+ "seats=" + cyc.getSeat());
		System.out.println("fast_car_info::" + fc.getName() + "role" + fc.getRole() + "seats=" + fc.getSeat() + "speed=" + fc.getSpeed());
	}

}