package methodesfine;

public class Fine {
    final private int VAST_BEDRAG_BOETE = 100;
    final private double VARIABEL_BEDRAG_BOETE = 2.5;

    public Fine() {
    }

    public void calculateFine(double speed, double maxSpeed) {
        if (speed > maxSpeed) {
            double toHard = speed - maxSpeed;
            double fine = VAST_BEDRAG_BOETE + toHard * VARIABEL_BEDRAG_BOETE;
            {
                System.out.println("You drove " + toHard + " kmh to fast, your fine is " + fine + " €");
            }
        } else System.out.println("Nice Driving!");
    }

    public double calculateFine1(double speed, double maxSpeed) {
        //if (speed > maxSpeed) {
            double toHard = speed - maxSpeed;
            double fine = VAST_BEDRAG_BOETE + toHard * VARIABEL_BEDRAG_BOETE;
            {
               return fine;
            }
        }
        //return 0;
    }






