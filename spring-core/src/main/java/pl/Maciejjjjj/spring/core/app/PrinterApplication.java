package pl.Maciejjjjj.spring.core.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.Maciejjjjj.spring.core.components.printers.Printer;

public class PrinterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("pl.Maciejjjjj.spring.core.components");
        context.refresh();

        Printer consolePrinter = context.getBean("consolePrinter", Printer.class);
        consolePrinter.print("Elo 3 2 0");

        Printer filePrinter = context.getBean("filePrinter", Printer.class);
        filePrinter.print("Elo 3 2 0");

        Printer dialogPrinter = context.getBean("dialogPrinter", Printer.class);
        dialogPrinter.print("Elo 3 2 0");

    }

}
