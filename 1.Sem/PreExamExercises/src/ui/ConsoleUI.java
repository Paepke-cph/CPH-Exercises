package ui;

import java.util.Scanner;

public class ConsoleUI implements UI {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

    @Override
    public void println(String output) {
        System.out.println(output);
    }
}
