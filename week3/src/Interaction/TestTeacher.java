package Interaction;

public class TestTeacher {
    public static void main(String[] args) {
        Course s1 = new Course("Java",6);
        Teacher t1 = new Teacher("peeters",s1);
        Teacher t2 = new Teacher("Janssens",s1);
        System.out.println(t1);
        System.out.println(t2);
        t1.print();
        s1.setStudyPoints(8);
        System.out.println(t1);
        System.out.println(t2);
        t1.print();



    }
}
