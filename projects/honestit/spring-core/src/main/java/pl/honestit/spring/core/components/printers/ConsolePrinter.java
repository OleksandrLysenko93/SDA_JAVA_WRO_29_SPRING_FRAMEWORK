package pl.honestit.spring.core.components.printers;

import pl.honestit.spring.core.components.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("console: " + message);
    }
}
