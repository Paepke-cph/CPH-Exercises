package core;

import ui.UI;

public class Squares {
    private UI ui;

    public Squares(UI ui) {
        this.ui = ui;
    }

    public void run() {
        ui.println("Number of rows and columns: ");
        int number = Integer.parseInt(ui.getUserInput());
        ui.println("The mark to be dispaly: ");
        String mark = ui.getUserInput();
        display(number,mark);
    }

    public void display(int number, String mark) throws IllegalArgumentException{
        if(number <=  0) throw new IllegalArgumentException("Number must be greater than 0");
        if(number > 0xFF) throw new IllegalArgumentException("Number is too large to be displayed");
        if(mark == null || mark.equals(" ")) throw new IllegalArgumentException("Mark must not be null or whitespace");

        for (int i = 0; i < number; i++) {
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < number; j++) {
                builder.append(mark);
                if(j != number-1) {
                    builder.append(" ");
                }
            }
            ui.println(builder.toString());
        }
    }
}
