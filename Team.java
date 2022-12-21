package Sports;
public class Team {
    String tName;
    int tPoints;
    String tMatches;

    public Team(String tName, int tPoints, String tMatches) {
        this.tName = tName;
        this.tPoints = tPoints;
        this.tMatches = tMatches;
    }

    public String gettName() {
        return tName;
    }

    public int gettPoints() {
        return tPoints;
    }

    public String gettMatches() {
        return tMatches;
    }
}
