public class Example {
    private String name;
    private int zipcode;
    private String address;

    public Example(String name, int zipcode, String address) {

        this.name = name;
        this.zipcode = zipcode;
        this.address = address;

    }

    public void print() {
        System.out.println(this.name + " " + this.zipcode + " " + this.address);


    }

}
