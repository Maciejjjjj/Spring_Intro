package pl.Maciejjjjj.spring.core.warmup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.Maciejjjjj.spring.core.components.printers.ConsolePrinter;
import pl.Maciejjjjj.spring.core.components.printers.DialogPrinter;
import pl.Maciejjjjj.spring.core.components.printers.Printer;
import pl.Maciejjjjj.spring.core.qualifiers.Console;

import java.util.Random;

@Component
public class HelloWorld {

    private Printer consolePrinter;
    private Printer dialogPrinter;
    private Printer somePrinter;

    @Console
    @Autowired
    public HelloWorld(Printer consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    @Qualifier(value = "dialogPrinter")
    @Autowired
    public void setDialogPrinter(Printer dialogPrinter) {
        this.dialogPrinter = dialogPrinter;
    }

    @Primary
    @Autowired
    public void setSomePrinter(Printer somePrinter) {
        this.somePrinter = somePrinter;
    }

    public HelloWorld() {

    }

    public void sayHello() {

        if (new Random().nextInt(2) > 0) {
            consolePrinter.print("Hello, world!");
        } else {
            dialogPrinter.print("Hello, world!");
        }

    }

}
