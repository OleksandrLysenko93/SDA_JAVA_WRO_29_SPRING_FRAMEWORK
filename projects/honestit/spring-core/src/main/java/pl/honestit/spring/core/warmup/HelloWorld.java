package pl.honestit.spring.core.warmup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.honestit.spring.core.components.Printer;
import pl.honestit.spring.core.components.printers.ConsolePrinter;
import pl.honestit.spring.core.components.printers.DialogPrinter;

import java.util.Random;

@Component
public class HelloWorld {

    private ConsolePrinter consolePrinter;
    private DialogPrinter dialogPrinter;

    @Autowired
    public HelloWorld(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    @Autowired
    public void setDialogPrinter(DialogPrinter dialogPrinter) {
        this.dialogPrinter = dialogPrinter;
    }

    public HelloWorld() {

    }

    public void sayHello() {
        Random random = new Random();
        int rand = random.nextInt(2);
        System.out.println("rand = " + rand);
        if (rand==0) {
            consolePrinter.print("Hello world!");
        } else if (rand==1) {
            dialogPrinter.print("Hello world!");
        } else {
            System.out.println("error");
        }
    }
}
