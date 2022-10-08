/*
public class FahrTemp {
    int cel;
    int far;

    public FahrTemp (int cel, int far){
        this.cel = 10;
        this.far = 50;
    }
    public void naarFar(int cel) {
        double res;

    }

    public void naarCel(int fah) {
        double res;

    }
}*/

public class FahrTemp {

    public FahrTemp() {

    }

    public void naFah(int cels) {

        double res = 1.8 * cels + 32;
        System.out.println(cels + " celsius = " + res + " fahrenheit.");

    }

    public void naCel(int fahr) {
        double res = (fahr - 32) / 1.8;
        System.out.println(fahr + " fahrenheit  = " + res + " celsius.");

    }
}
