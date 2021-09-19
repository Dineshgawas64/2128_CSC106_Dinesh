public class Bowler {
	String name;
	int numOfGamesPlayed, numOfOversBowled, numOfFiveWickets, numOfTenWickets;
	
	Bowler(){
		
	}
	
	
	Bowler(String name,int numOfGamesPlayed,int numOfOversBowled,int numOfFiveWickets, int numOfTenWickets, float avgRunsGivenPerWicket){
		this.name = name;
		this.numOfGamesPlayed  = numOfGamesPlayed;
		this.numOfOversBowled = numOfOversBowled;
		this.numOfFiveWickets = numOfFiveWickets;
		this.numOfTenWickets = numOfTenWickets;
	}
	
	void displayResults(){
		System.out.println("=====Start of Bowler Results====\n");
		System.out.println("Name of Bowler: " + name);
		System.out.println("Number of games played: " + numOfGamesPlayed);
		System.out.println("Number of overs bowled: " + numOfOversBowled);
		System.out.println("Number of five wickets taken: " + numOfFiveWickets);
		System.out.println("Number of ten wickets taken: " + numOfTenWickets);
		System.out.println("\n=====End of Bowler Results====\n");
	}

}
