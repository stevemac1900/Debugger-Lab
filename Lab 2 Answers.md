#Answers to lab 2

**Question 1:** The parameter cutoffValue is part of the constructor method PigGame.

**Question 2:** 0.0

**Question 3:** In method playTurn, 

    while(!rolledOne && score < cutoff && score + s.getScore() < 100)
    {
      d.roll();
      if (d.getUpValue() == 1)
      {
        score = 0;
        rolledOne = true;
        numBusts += 1;
      }
      else
        score = score + d.getUpValue();
    }
    
    return score;
  }
}

**Question 4:** I think the problem(s) might be located in either PigGame or ScoreSheet. I think it is unlikely that the issue is with Die or Main.

**Question 5:** The problem was in the file Die.java, with the method roll, value upValue. The program was casting random numbers between 0 and 1 into int values, which is always 0, then adding 1 which leaves us with 1 as the upValue every time. I moved the cast outside of the parentheses so that the random value is multiplied by 6 before it is cast into an int and added to 1. 

**Question 6:**

10: 14

15: 13

20: 12

25: 12