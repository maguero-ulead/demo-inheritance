package cr.ac.ulead.entities;

public class PlayerNBA extends Player {

    private int height;
    private int weight;
    private int yearBorn;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    @Override
    public String toString() {
        return "PlayerNBA{ " + super.toString() + ",height: " + this.height + ", weight: " + this.weight
                + ", yearBorn" + this.yearBorn + " }";
    }
}
