package cr.ac.ulead.entities;

public class PlayerNFL extends Player {

    private String status;
    private String highSchool;
    private String yearsPlayed;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getYearsPlayed() {
        return yearsPlayed;
    }

    public void setYearsPlayed(String yearsPlayed) {
        this.yearsPlayed = yearsPlayed;
    }

    @Override
    public String toString() {
        return "PlayerNFL{ " + super.toString() + ",status: " + this.status + ", High School: " + this.highSchool
                + ", years played" + this.yearsPlayed + " }";
    }
}
