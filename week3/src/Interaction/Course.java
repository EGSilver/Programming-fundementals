package Interaction;

public class Course {
    private String discription;
    private int studyPoints;

    public Course(String discription, int studyPoints) {
        this.discription = discription;
        this.studyPoints = studyPoints;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        if (studyPoints >= 3 && studyPoints <=8) {
        this.studyPoints = studyPoints;
    } else
            System.out.println("Studiepunten moeten 3 & 8 liggen.");
    }

    @Override
    public String toString() {
        return "Studyclass{" +
                "discription='" + discription + '\'' +
                ", studyPoints=" + studyPoints +
                '}';
    }
}
