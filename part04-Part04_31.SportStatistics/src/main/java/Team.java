public class Team {
   private String teamName;
   private int matchesPlayed;
   private int matchesWon;
   private int matchesLost;

   public Team (String teamName, int MatchesPlayed, int matchesWon, int matchesLost){
      this.teamName=teamName;
      this.matchesPlayed=0;
      this.matchesWon=0;
      this.matchesLost=0;
   }

   public int getMatchesPlayed(){
      return this.matchesPlayed;
   }

   public int getmatchesWon(){
      return this.matchesWon;
   }

   public int getmatchesLost(){
      return this.matchesLost;
   }

   public void setMatchesPlayed(int num){
      this.matchesPlayed = num;
   }

   public void setMatchesWon(int num){
      this.matchesWon = num;
   }

   public void setMatchesLost(int num){
      this.matchesLost = num;
   }


}
