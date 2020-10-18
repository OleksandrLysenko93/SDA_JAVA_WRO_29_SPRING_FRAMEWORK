package pl.honestit.spring.core.components.printers;

import pl.honestit.spring.core.components.Printer;

import javax.swing.*;

public class DialogPrinter implements Printer {
    @Override
    public void print(String message) {
        //System.out.println("dialog: " + message);
        JOptionPane.showMessageDialog(null, message);
    }
}
