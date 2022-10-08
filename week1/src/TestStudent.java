public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Vervaeck", "Dean", 60);
        Student student2 = new Student("Jansens", "Jan", 45);
        System.out.println(student1);
        System.out.println(student2);

        //object.doeIets
        student1.print();
        student2.print();
    }
}
