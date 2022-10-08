public class HP {
    private String MalformedDromedary;
    private String Skating;
    private String Baby;
    private String Man;
    private String ChthuluMythos;
    private String Can;

    public HP(String malformedDromedary, String skating, String baby, String man, String chthuluMythos, String can) {
        MalformedDromedary = malformedDromedary;
        Skating = skating;
        Baby = baby;
        Man = man;
        ChthuluMythos = chthuluMythos;
        Can = can;
    }

    public void print() {
        System.out.println("You see a "+this.MalformedDromedary+" "+this.Skating+" over a "+this.Baby+" while a "+this.Can+" drops on the floor ejecting it into the "+this.Baby+"'s face.");
        System.out.println("Meanwhile a "+this.Man+" is walking by while reading "+this.ChthuluMythos+".");
    }
}


