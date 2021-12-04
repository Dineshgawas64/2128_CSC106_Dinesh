
import com.everything.World;

public class Game {

	
	

	public static void main(String[] args) {
	
		World w = new World() {};
		System.out.println("******ROCKSTAR GAMES*********");
		System.out.println("Welcome to Vice City");
		
		w.start_fast_car(null, null);
		w.start_slow_car(null, null);
		w.police_chase(null, null, null);
		w.player_counter(null, null, null, null, null, null);

	}

}