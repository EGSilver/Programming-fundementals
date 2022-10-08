package selection;

public class Points {
    private int getal;

    public Points(int getal) {

        this.getal = getal;
    }

    public void print() {
        if (getal >=20) {
            getal = 20; {
                System.out.println("Grootste onderscheiding");
            }
        }  else if (getal >= 18) {
            System.out.println("Grootste onderscheiding");
        } else if (getal >= 16) {
            System.out.println("Grote onderscheiding");
        } else if (getal >= 14) {
            System.out.println("onderscheidng");
        }  else if (getal >= 0) {
                System.out.println("onvoldoende");
            }
        else {
            System.out.println("Negatief");
            this.getal  = 0;
            System.out.println(getal);
        }
        }

    }


