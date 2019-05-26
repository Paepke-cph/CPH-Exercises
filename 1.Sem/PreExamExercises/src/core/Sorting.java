package core;

import ui.MockUI;
import ui.UI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    private UI ui;
    public Sorting(UI ui) {
        this.ui = ui;
    }

    public void sort() {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            res.add(ui.getUserInput());
        }

        Collections.sort(res);

        for(int i = res.size()-1; i >= 0; i--) {
            ui.println(res.get(i));
        }
    }
}
