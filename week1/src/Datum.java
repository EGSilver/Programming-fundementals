public class Datum {
    private String day;
    private String month;
    private String year;

    public Datum(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

}
