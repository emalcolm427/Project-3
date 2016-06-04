/*******************************************************************************
This is the parent class that has attributes that are useful to the subclass.
@author Eric Malcolm, Section 001
*******************************************************************************/

public class Team {
    protected String teamName;
    protected int wins, losses;
    protected double winLossPct;

    public Team(String teamName, int wins, int losses, double winLossPct) {
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.winLossPct = winLossPct;
    }    

    public Team(int wins, int losses) {
        this.wins = wins;
        this.losses = losses;
    }
    
    //default constructor
    public Team() {
    }
    
    //all of the getters and setters
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getWinLossPct() {
        return winLossPct;
    }

    public void setWinLossPct(double winLossPct) {
        this.winLossPct = winLossPct;
    }     
    
    public double CalcWinLoss (int wins, int losses) {
        winLossPct = (double) wins/ (wins + losses);       
        return winLossPct;
    }

}
