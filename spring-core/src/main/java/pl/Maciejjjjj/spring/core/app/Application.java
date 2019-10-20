package pl.Maciejjjjj.spring.core.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import pl.Maciejjjjj.spring.core.config.WarmUpConfiguration;
import pl.Maciejjjjj.spring.core.warmup.HelloWorld;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(WarmUpConfiguration.class);
        context.scan("pl.Maciejjjjj.spring.core.warmup");
        context.refresh();

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();


        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();

        System.out.println(helloBean == helloWorld);

        HelloWorld helloBean2 = context.getBean("helloBean", HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);

        System.out.println(helloBean == helloBean2);
        System.out.println(helloWorld == helloWorld2);
    }

    private static void genericWarmUp() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("helloBean", HelloWorld.class);
        context.refresh();

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();
    }

    private static void classPathWarmUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloBean = context.getBean("helloBean", HelloWorld.class);
        helloBean.sayHello();
    }

}
