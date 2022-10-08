package homework;

public class Year {
    private int year;
    private boolean year1;

    public Year(int year) {
        this.year = year;
    }

    public void checkLeapYearandPrint() {
        if (year % 400 == 0) {
            System.out.println(this.year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(this.year + " not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(this.year + " is a leap year");
        } else System.out.println("not a leap year.");
    }

    public void checkLeapYearandPrint2() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(this.year + " is a leap year");
                } else
                    System.out.println(this.year + " not a leap year");
            } else
                System.out.println(this.year + " is a leap year");
        } else
            System.out.println(this.year + " not a leap year");

    }
}
   /* public void checkLeapYearandPrint3() {
        if (year / 4) {
            if (year1 / 100) {
                if (year1 / 400) {
                    System.out.println(this.year1 + "YES");
                } else System.out.println(this.year1 + "NO");
            } else System.out.println(this.year1 + "YES");
        } else System.out.println(this.year1 + "NO");
    }*/


// if / 4 = schrikkeljaar
// if / 100 = geen schrikkeljaar
// if / 400 = schrikkeljaar

