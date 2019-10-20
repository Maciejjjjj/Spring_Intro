package pl.Maciejjjjj.spring.core.components.printers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.Maciejjjjj.spring.core.qualifiers.Console;

@Console
@Primary
@Component
public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
