package core;

import ui.UI;

public class Menu {
    private UI ui;
    public Menu(UI ui) {
        this.ui = ui;
    }

    /*
    Menuvalg
    Skriv en metode, som præsenterer brugeren for følgende menu på skærmen:
    1.	Beregn
    2.	Udskriv
    3.	Hjælp
    Metoden skal:
    •	udskrive menuen på skærmen
    •	læse brugerens valg (fra tastaturet)
    •	returnere menuvalget som et heltal
    •	Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et forkert menuvalg)
    */
    public int display() throws IllegalArgumentException {
        ui.println("1.\tBeregn");
        ui.println("2.\tUdskriv");
        ui.println("3.\tHjælp");
        int res = Integer.parseInt(ui.getUserInput());
        if(res < 1 || res > 3) {
            throw new IllegalArgumentException("Den indtastede værdi skal være 1,2, eller 3");
        }
        return res;
    }
}
