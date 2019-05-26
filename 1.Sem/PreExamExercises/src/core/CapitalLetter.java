package core;

import ui.MockUI;
import ui.UI;

import java.util.ArrayList;
import java.util.List;

public class CapitalLetter {
    private UI ui;
    public CapitalLetter(UI ui) {
        this.ui = ui;
    }

    public void run() {
        List<String> input = new ArrayList<>();

        String line;
        while(!(line = ui.getUserInput()).equals("")) {
            input.add(line);
        }
        int count = 0;
        for(String str : input) {
            if((str.charAt(0)+"").equals((str.charAt(0)+"").toUpperCase())) {
                count++;
            }
        }
        ui.println(count + " tekststrenge begyndte med stort forbogstav");
    }
}
