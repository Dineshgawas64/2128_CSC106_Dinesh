public class Batsman {
	
	String name;
	int GamesPlayed, Centuries, fifties;
	float avgRunsScored;
	
	Batsman(){
		
	}
	
	Batsman(String name,int GamesPlayed,int Centuries, int fifties, float avgRuns){
		this.name = name;
		this.GamesPlayed  = GamesPlayed;
		this.Centuries = Centuries;
		this.fifties = fifties;
		this.avgRunsScored = avgRuns;
	}
	
	void displayResults(){
		System.out.println("=====Start of Batsman Results====\n");
		System.out.println("Name of Batsman: " + name);
		System.out.println("Number of games played: " + GamesPlayed);
		System.out.println("Number of centuries scored: " + Centuries);
		System.out.println("Fifties scored: " + fifties);
		
		System.out.println("\n=====End of Batsman Results====\n");
	}
}
