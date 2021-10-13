
public class Score_logic extends Game_logic{
	
	int score1;
	int score2;

	
	score1 = score2=0;
	
	public int scorefirst() {
		 
		boolean point_scored;
		
		if(point_scored==true) {
			
			boolean player1;
			if(player1 scored==true)
			{
				if(score1==0)
				{
					score1 = 15;
					
					return score1;
				}
				else if(score1==15)
				{
					score1 = score1+15;
				
					return score1;
				}
				else if(score1 == 30)
				{
					score1 = score1+10;
				
					return score1;
				}
				
			}
			else
			{
				if(score2==0)
				{
					score2 = 15;
					
					return score2;
				}
				else if(score2==score2)
				{
					score2 = score2+15;
					return score2;
				}
				else if(score2 == 30)
				{
					score2 = score2+10;
					return score2;
				}
			}
			
		}
		
		if(score1==40)
		{
			System.out.println("player 1 won");
		}
		
		if(score2==40)
		{
			System.out.println("player 2 won");
		}
	}
	
	
	
}
