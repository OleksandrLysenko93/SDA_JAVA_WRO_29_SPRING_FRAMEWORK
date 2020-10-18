package pl.honestit.spring.core.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.honestit.spring.core.components.Printer;
import pl.honestit.spring.core.components.printers.ConsolePrinter;
import pl.honestit.spring.core.components.printers.DialogPrinter;
import pl.honestit.spring.core.components.printers.FilePrinter;
import pl.honestit.spring.core.config.WarmUpConfiguration;
import pl.honestit.spring.core.warmup.HelloWorld;

public class PrinterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);

        HelloWorld helloBean = context.getBean("helloWorld", HelloWorld.class);
        helloBean.sayHello();

//        ConsolePrinter consoleBean = context.getBean("consolePrinterBean", ConsolePrinter.class);
//        consoleBean.print("aaa");
//        FilePrinter fileBean = context.getBean("filePrinterBean", FilePrinter.class);
//        fileBean.print("bbb");
//        Printer dialogBean = context.getBean("dialogPrinterBean", DialogPrinter.class);
//        dialogBean.print("ccc");
//
//        ConsolePrinter consoleBean2 = context.getBean(ConsolePrinter.class);
//        consoleBean2.print("aaa");
//        FilePrinter fileBean2 = context.getBean(FilePrinter.class);
//        fileBean2.print("bbb");
//        Printer dialogBean2 = context.getBean(DialogPrinter.class);
//        dialogBean2.print("ccc");


    }
}
