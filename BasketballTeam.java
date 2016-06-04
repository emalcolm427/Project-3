/*******************************************************************************
This subclass is used to keep track of the tournament status.
@author Eric Malcolm, Section 001
*******************************************************************************/

public class BasketballTeam extends Team {
    private String status;
    
    public BasketballTeam(int wins, int losses) {
        super(wins, losses);
        this.wins = wins;
        this.losses = losses;
    }
    
    public BasketballTeam(String teamName) {
        this.teamName = teamName;
    }
    
    public BasketballTeam(String status, String teamName, int wins, int losses, double winLossPct) {
        super(teamName, wins, losses, winLossPct);
        this.status = status;
    }   
    
    //getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
