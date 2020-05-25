package cr.ac.ulead.entities;

public class Player {

    private int id;
    private String name;
    private String birthplace;
    private String college;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }


    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + "\'" +
                ", birthplace='" + birthplace + "\'" +
                ", college='" + college + "\'";
    }
}
