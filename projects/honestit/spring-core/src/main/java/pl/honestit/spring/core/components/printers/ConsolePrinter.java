package pl.honestit.spring.core.components.printers;

import org.springframework.stereotype.Component;
import pl.honestit.spring.core.components.Printer;

@Component
public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("console: " + message);
    }
}
