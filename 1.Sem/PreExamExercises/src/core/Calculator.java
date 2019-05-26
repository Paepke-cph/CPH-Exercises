package core;


import ui.UI;

public class Calculator {
    private UI ui;
    private final int MAX_VALUE = 50;
    private final int MIN_VALUE = 1;
    public Calculator(UI ui) {
        this.ui = ui;
    }

    public void calculate(int val1, int val2) {
        if(val1 < MIN_VALUE || val1 > MAX_VALUE ||
        val2 < MIN_VALUE || val2 > MAX_VALUE) {
            throw new IllegalArgumentException("Begge tal skal være mellem 1 og 50 (begge tal er inklusive");
        }
        else {
            ui.println(val1+val2+"");
            ui.println(val1-val2+"");
            ui.println(val1/val2+"");
            ui.println(val1*val2+"");
        }
    }
}
