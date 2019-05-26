package core;

import ui.UI;

public class Grass {
    private final double DAILY_INCREASE = 0.8;

    private UI ui;

    public Grass(UI ui) {
        this.ui = ui;
    }

    // Method for running a small program making use of the below method.
    public void run() {
        double currentHeight = Double.parseDouble(ui.getUserInput());
        double maxHeight = Double.parseDouble(ui.getUserInput());
        double days = daysToCut(currentHeight,maxHeight);
        String output = String.format("Dage til græsset skal slås: %.2f",days);
        ui.println(output);
    }

    /*
    3) OPGAVE: Hvor tit skal græsset slås
    Om sommeren vokser græsset ca. 0,8 cm om dagen.
    Skriv en metode, der tager imod 2 inputparametre: hvor langt græsset er lige nu og hvor højt det må være for at skulle slås.
    Metoden skal beregne og returnere hvor mange dage der er til, at græsset skal slås næste gang.
    Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.
        1.	Græsset skal overstige denne værdi, før vi starter græsslåmaskinen
        2.	Græsset skal slås, inden værdien overstiges
        3.
        Du vælger selv hvilken løsning du vil implementere.

    Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.
    Alle tal, som bliver udskrevet, bør kun have 2 decimaler efter kommaet.
    */
    public double daysToCut(double currentHeight, double maxHeight) {
        double currentDif = maxHeight - currentHeight;
        return currentDif / DAILY_INCREASE;
    }
}
