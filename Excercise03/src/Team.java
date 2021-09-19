
public class Team {
	
	public static void main(String[] args) {
		
		Batsman batsman[] = {new Batsman("batsman1", 20, 5, 4, 4.1f), new Batsman("batsman2", 20, 6, 5, 5.2f)};
		
		Bowler bowler[] = {new Bowler("bowler1", 20, 6, 3, 3, 2.1f), new Bowler("bowler2", 20, 8, 6, 2, 3.1f)};
		
		printAll(batsman, bowler);
	}
	
	static void printAll(Batsman batsman[], Bowler bowler[]) {
		for(int i = 0; i < batsman.length; i++) {
			batsman[i].displayResults();
		}
		
		for(int i = 0; i < bowler.length; i++) {
			bowler[i].displayResults();
		} 
	
	} 
	
	
}
