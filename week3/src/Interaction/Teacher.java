package Interaction;

public class Teacher {
    private String name;

    //Geen string indien er een klasse voor bestaat / gemaakt is.
    private Course course;

    public Teacher(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void print() {
        //Peeters geeft Java, 6 Studiepunten
        System.out.println(this.name +" geeft " + this.course.getDiscription() +", " + this.course.getStudyPoints() + " studiepunten");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", studyclass=" + course +
                '}';
    }
}
