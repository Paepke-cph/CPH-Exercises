package core;

import ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        Grass grass = new Grass(new ConsoleUI());
        grass.run();
    }
}
