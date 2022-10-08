package homework;

public class Fine {
    private final int FIXED_AMOUNT_FINE = 100;
    private final double VARIABLE_AMOUNT_FINE = 2.5;

    public Fine() {
    }

    public void calculateAndPrint(double speed, double maxSpeed) {
        double res = (speed - maxSpeed);
        double calculatedFine = (res * VARIABLE_AMOUNT_FINE + FIXED_AMOUNT_FINE);
        if (speed > maxSpeed) {
            System.out.println("Indien je hier voorbij flitst, flitsen wij terug! \n" +
                    "Je reed "+ res +" te snel, je boete bedraagt "+ calculatedFine  +" euro ");
        } // else
    }


}
