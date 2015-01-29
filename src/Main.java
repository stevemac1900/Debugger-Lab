/**
 * This class is a simple driver to run one pig game.  It could 
 * be used more generally to answer more interesting questions.
 * e.g. What is the average number of turns for all cutoffs
 * between 10 and 30?
 */
public class Main
{
  public static void main(String[] args)
  {
    int totalTurns = 0;
    for (int i=0 ; i<1000 ; i++)
    {
    // Create a new game with a cutoff of 18
    PigGame g = new PigGame(25);
    
    // Run one game
    g.playGame();
    
    totalTurns += g.getNumTurns();
    }
  System.out.println(totalTurns / 1000);
  }
}