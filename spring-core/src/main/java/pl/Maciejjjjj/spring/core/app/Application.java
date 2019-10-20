package pl.Maciejjjjj.spring.core.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.Maciejjjjj.spring.core.warmup.HelloWorld;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();

    }

    private static void genericWarmUp(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("helloBean", HelloWorld.class);
        context.refresh();

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();
    }
}
