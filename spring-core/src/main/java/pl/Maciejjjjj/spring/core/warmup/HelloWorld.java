package pl.Maciejjjjj.spring.core.warmup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.Maciejjjjj.spring.core.components.printers.ConsolePrinter;
import pl.Maciejjjjj.spring.core.components.printers.DialogPrinter;
import pl.Maciejjjjj.spring.core.components.printers.Printer;

import java.util.Random;

@Component
public class HelloWorld {

    private ConsolePrinter consolePrinter;
    private DialogPrinter dialogPrinter;
    private Printer somePrinter;

    @Autowired
    public HelloWorld(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    @Autowired
    public void setDialogPrinter(DialogPrinter dialogPrinter) {
        this.dialogPrinter = dialogPrinter;
    }

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
