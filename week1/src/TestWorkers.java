public class TestWorkers {
    public static void main(String[] args) {
        Workers worker1 = new Workers("Andrew",1250, "2550",29);
        worker1.print();
        worker1.raiseWagePercentage();
        worker1.print();
        worker1.raiseWage(625);
        worker1.print();

    }
}
