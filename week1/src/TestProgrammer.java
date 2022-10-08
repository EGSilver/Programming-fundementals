
public class TestProgrammer {
    public static void main(String[] args) {
        Programmer p = new Programmer("JAVA","Jefke", 5000);
        System.out.println(p);
        p.verhoogSalBedrag(100);
        System.out.println(p);
        p.verhoogSalProcent();
        System.out.println(p);
    }
}
