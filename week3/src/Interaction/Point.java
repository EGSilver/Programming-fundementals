package Interaction;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double xAndY(Point p) {
        return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));


       // Neem de vierkantswrtel van (x2 - x1)2 + (y2 - y1)2
    }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}









/*
        Genereer constructor, getters en setters en een toString functie.
        Wijzig de de toString functie zodat de volgende String gereturned wordt.
        (x=1.25, y=-5.23)


        Maak een testklasse TestPunt en maak daarin 2 punten aan met respectievelijk de coördinaten (10,10) en
        (20,30).
        Maak een klasse Lijnstuk (in dezelfde package als de voorheen gemaakte klasse Punt).
        Deze klasse heeft twee attributen, nl. twee variabelen van het type Punt. Het eerste noemen we beginPunt,
        het tweede eindPunt.
        Genereer constructors en getters en setters.
        Wijzig de toString-functie zodat je string er als volgt uitziet.
        (10,20) – (20,50)
        Je voegt ook een methode afstand toe aan deze klasse. Deze methode retourneert een double, nl. de
        afstand tussen het eindPunt en het beginPunt. Om die afstand te berekenen, ga je als volgt te werk:
        -Voeg eerst aan de klasse Punt een methode afstandTot toe.
        1 parameter : het andere punt.
        Je berekent in deze methode dus de afstand van het this-punt tot parameter-punt.
        En nu frissen we onze wiskunde op! Stelling van Pythagoras?
        Geen nood : hier komt de formule en bovendien is alles te vinden op het internet, dus het enige wat jij nog
        moet doen is deze formule omzetten naar Java.
        Neem de vierkantswortel van (x2 - x1)2 + (y2 - y1)2
        .
        Hierbij zijn (x2, y2) de coördinaten van het als parameter aangeleverde punt.
        (x1, y1) de coordinaten van het this-punt.
        Om een vierkantswortel te berekenen in Java gebruik je de methode sqrt uit de klasse Math ->
        Math.sqrt(...).*/
